import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main{

	int N;
	int[] ts;
	int[] cs;

	class Swimmer{
		int speed, res, endLap, curLap;
		Swimmer(int s, int r, int e, int c){
			this.speed = s;
			this.res= r;
			this.endLap= e;
			this.curLap= c;
		}
	}

	void run(){
		Scanner in = new Scanner(System.in);
		for(;;){
			N = in.nextInt();
			if(N==0) return ;
			ts = new int[N];
			cs = new int[N];
			for(int i=0; i<N; i++){
				ts[i] = in.nextInt();
				cs[i] = in.nextInt();
			}
			System.out.println(solve());
		}
	}

	int solve(){
		Swimmer[] ss = new Swimmer[N];
		for(int i=0; i<N; i++){
			ss[i] = new Swimmer(ts[i], ts[i], cs[i], 0);
		}
		Arrays.sort(ss, new Comparator<Swimmer>(){
			public int compare(Swimmer a, Swimmer b){
				return a.speed > b.speed?1:a.speed == b.speed?0:-1;
			}
		});
		ArrayList<Swimmer> Q1 = new ArrayList<Swimmer>(), Q2 = new ArrayList<Swimmer>();
		for(int i=0; i<N; i++){
			Q1.add(ss[i]);
		}
		int t = 0;
		for(;;){
			ArrayList<Swimmer> t1 = new ArrayList<Swimmer>(), t2 = new ArrayList<Swimmer>();
			ArrayList<Swimmer> s1 = new ArrayList<Swimmer>(), s2 = new ArrayList<Swimmer>();
			int proc = Q1.isEmpty()?Q2.get(0).res:Q2.isEmpty()?Q1.get(0).res:Math.min(Q1.get(0).res, Q2.get(0).res);
			t += proc;
			for(int i=0; i<Q1.size(); i++){
				Q1.get(i).res -= proc;
			}
			for(int i=0; i<Q2.size(); i++){
				Q2.get(i).res -= proc;
			}
			boolean flag = true;
			for(int i=0; i<Q1.size(); i++){
				Swimmer s = Q1.get(i);
				if(s.res > 0) flag = false;
				if(flag){
					s.res = s.speed;
					s2.add(s);
				}
				else{
					t1.add(s);
				}
			}
			flag = true;
			for(int i=0; i<Q2.size(); i++){
				Swimmer s = Q2.get(i);
				if(s.res > 0) flag = false;
				if(flag){
					if(++s.curLap < s.endLap){
						s.res = s.speed;
						s1.add(s);
					}
				}
				else{
					t2.add(s);
				}
			}
			Collections.sort(s1, new Comparator<Swimmer>(){
				public int compare(Swimmer a, Swimmer b){
					return a.speed > b.speed?1:a.speed == b.speed?0:-1;
				}
			});
			Collections.sort(s2, new Comparator<Swimmer>(){
				public int compare(Swimmer a, Swimmer b){
					return a.speed > b.speed?1:a.speed == b.speed?0:-1;
				}
			});
			for(int i=0; i<s1.size(); i++){
				t1.add(s1.get(i));
			}
			for(int i=0; i<s2.size(); i++){
				t2.add(s2.get(i));
			}
			if(t1.isEmpty() && t2.isEmpty()) break;
			Q1.clear();
			Q2.clear();
			for(int i=0; i<t1.size(); i++){
				Q1.add(t1.get(i));
			}
			for(int i=0; i<t2.size(); i++){
				Q2.add(t2.get(i));
			}
		}
		return t;
	}

	public static void main(String args[]){
		new Main().run();
	}
}