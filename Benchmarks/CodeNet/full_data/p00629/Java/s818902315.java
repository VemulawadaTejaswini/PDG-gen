import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

class Team implements Comparable<Team>{
	int id;
	int syo;
	int slove;
	int penalty;
	Team(int a,int b,int c,int d){
		id=a;
		syo=b;
		slove=c;
		penalty=d;
	}
	@Override
	public int compareTo(Team o) {
		if(o.slove < this.slove){
			return -1;
		}
		else if(o.slove > this.slove){
			return 1;
		}
		else{
			if(o.penalty > this.penalty){
				return -1;
			}
			else if(o.penalty < this.penalty){
				return 1;
			}
			else{
				if(o.id > this.id){
					return -1;
				}
				else if(o.id > this.id){
					return 1;
				}
			}
		}
		return 0;
	}
}

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	void run(){
		Scanner sc=new Scanner(System.in);
		while(true){
			int n=sc.nextInt();
			if(n==0) break;
			Team t[]=new Team[n];
			for(int i=0; i<n; i++){
				t[i]=new Team(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
			}
			Arrays.sort(t);
			
			int senbatsu[]=new int[n];
			HashMap<Integer, Integer> h=new HashMap<Integer, Integer>();
			int count=0;
			for(int i=0; i<n; i++){
				if(count<10){
					if(!h.containsKey(t[i].id)){
						h.put(t[i].id, 1);
						senbatsu[count]=t[i].id;
						count++;
					}
					else if(h.get(t[i].id)<3){
						int temp=h.get(t[i].id);
						h.put(t[i].id, temp+1);
						senbatsu[count]=t[i].id;
						count++;
					}
				}
				else if(count<20){
					if(!h.containsKey(t[i].id)){
						h.put(t[i].id, 1);
						senbatsu[count]=t[i].id;
						count++;
					}
					else if(h.get(t[i].id)<2){
						int temp=h.get(t[i].id);
						h.put(t[i].id, temp+1);
						senbatsu[count]=t[i].id;
						count++;
					}
				}
				else if(count<30){
					if(!h.containsKey(t[i].id)){
						h.put(t[i].id, 1);
						senbatsu[count]=t[i].id;
						count++;
					}
				}
			}
			Arrays.sort(senbatsu, 0, count);
			for(int i=0; i<count; i++){
				System.out.println(senbatsu[i]);
			}
		}
	}

}