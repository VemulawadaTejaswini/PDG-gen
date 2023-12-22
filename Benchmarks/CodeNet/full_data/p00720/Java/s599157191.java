import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main{

	int[][] vxs, vys;
	int[] xs, ys;
	boolean[] hasData;
	String[] name;
	ArrayList<String> ans;
	int N, T, R;

	int sq(int x){
		return x*x;
	}

	void run(){
		Scanner in = new Scanner(System.in);
		for(;;){
			N = in.nextInt(); T = in.nextInt(); R = in.nextInt();
			if(N==0) return ;
			ans = new ArrayList<String>();
			vxs = new int[N][T]; vys = new int[N][T];
			xs = new int[N]; ys = new int[N];
			hasData = new boolean[N]; hasData[0] = true;
			name = new String[N];
			for(int i=0; i<N; i++){
				name[i] = in.next();
				int cur = in.nextInt();
				xs[i] = in.nextInt(); ys[i] = in.nextInt();
				for(;;){
					int t = in.nextInt(), vx = in.nextInt(), vy = in.nextInt();
					for(int j=cur; j<t; j++){
						vxs[i][j] = vx; vys[i][j] = vy;
					}
					cur = t;
					if(t==T) break;
				}
			}
			solve();
		}
	}

	void print(){
		for(int i=0; i<ans.size(); i++)for(int j=0; j<ans.size()-1; j++){
			if(ans.get(j).compareTo(ans.get(j+1))>0){
				String tmp = ans.get(j+1); ans.set(j+1,ans.get(j)); ans.set(j,tmp);
			}
		}
		for(int i=0; i<ans.size(); i++){
			System.out.println(ans.get(i));
		}
	}

	class State{
		double time;
		int id1, id2;
		State(double t, int i, int j){
			this.time = t;
			this.id1 = i;
			this.id2 = j;
		}
	}

	void solve(){
		for(int k=0; k<N; k++){
			for(int i=0; i<N; i++){
				for(int j=0; j<N; j++){
					if(i!=j && sq(xs[i]-xs[j])+sq(ys[i]-ys[j])<=sq(R) && (hasData[i]||hasData[j])){
						hasData[i] = hasData[j] = true;
					}
				}
			}
		}
		
		for(int t=0; t<T; t++){
			ArrayList<State> Q = new ArrayList<State>();
			for(int i=0; i<N; i++){
				for(int j=i+1; j<N; j++){
					int A = sq(vxs[i][t]-vxs[j][t]) + sq(vys[i][t]-vys[j][t]),
						B = (xs[i]-xs[j])*(vxs[i][t]-vxs[j][t]) 
								+ (ys[i]-ys[j])*(vys[i][t]-vys[j][t]),
						C = sq(xs[i]-xs[j]) + sq(ys[i]-ys[j]) - sq(R),
						D = B*B - A*C;
					if(A!=0 && D>=0){
						double a1 = (-B + Math.sqrt(D))/A, a2 = (-B - Math.sqrt(D))/A;
						if(0<=a1 && a1<=1){
							Q.add(new State(a1, i, j));
						}
						if(0<=a2 && a2<=1){
							Q.add(new State(a2, i, j));
						}
					}
					if(A==0 && B!=0 && 0<=-0.5*C/B && -0.5*C/B<=1){
						Q.add(new State(-0.5*C/B, i, j));
					}
				}
			}
			Collections.sort(Q, new Comparator<State>(){
				public int compare(State a, State b){
					return a.time>b.time?1:a.time<b.time?-1:0;
				}
			});
			for(int i=0; i<Q.size(); i++){
				State st = Q.get(i);
				if(hasData[st.id1] || hasData[st.id2]){
					hasData[st.id1] = hasData[st.id2] = true;
				}
			}
			for(int i=0; i<N; i++){
				xs[i] += vxs[i][t];
				ys[i] += vys[i][t];
			}
		}
		for(int i=0; i<N; i++)if(hasData[i]){
			ans.add(name[i]);
		}
		print();
	}


	public static void main(String[] args){
		new Main().run();
	}
}