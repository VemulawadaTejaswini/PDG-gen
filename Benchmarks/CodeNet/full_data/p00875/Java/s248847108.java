import java.util.*;
import static java.lang.Math.*;
public class Main {
	final Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		new Main().init();
	}
	void init(){
		final long STACK_SIZE=8*1024*1024;
		new Thread(null, new B(), "RUN", STACK_SIZE).start();
	}
	
	class B implements Runnable{
		B(){}
		@Override public void run(){
			while(sc.hasNext()){
				N=sc.nextInt();
				if(N==0)	break;
				solve();
			}
		}
		
		int N;
		
		void solve(){
			String[] a=new String[N],b=new String[N];
			for(int i=0; i<N; ++i){
				a[i]=sc.next();
				b[i]=sc.next();
			}
			
			String g=sc.next(),s=sc.next();
			
			PriorityQueue<State> open=new PriorityQueue<State>();
			open.add(new State(g,0));
			
			ArrayList<HashSet<String>> closed=new ArrayList<HashSet<String>>();
			closed.add(new HashSet<String>());
			closed.get(0).add(g);
			
			int ans=-1;
			while(!open.isEmpty()){
				
				State now=open.poll();
				
				//System.out.println("now = " + now);
				
				if(now.s.equals(s)){
					//System.out.println("ANS:"+now.s);
					ans=now.step;
					break;
				}
				
				for(int i=0; i<N; ++i){
					
					if(!now.s.matches(".*?"+a[i]+".*?"))	continue;
					
					String tmp=now.s.replaceAll(a[i], b[i]);
					
					if(tmp.length()>s.length())	continue;
					
					//System.out.println("temp = " + tmp+" "+(now.step+1));
					
					if(now.step+1 >= closed.size()){
						closed.add(new HashSet<String>());
					}else if(closed.get(now.step+1).contains(tmp)){
						continue;
					}
					
					for(int j=1; j<=now.step+1; ++j)	closed.get(j).add(tmp);
					open.add(new State(tmp, now.step+1));
					
					
				}
				
			}
			
			System.out.println(ans);
			
		}
		
		class State implements Comparable<State>{
			String s;
			int step;
			State(String s,int step){
				this.s=s;
				this.step=step;
			}
			@Override public int compareTo(State s){
				return this.step-s.step;
			}
			@Override public String toString(){
				return s+" "+step;
			}
		}
		
	}
}