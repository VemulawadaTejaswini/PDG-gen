
import java.util.*;
import static java.lang.Math.*;

public class Main {
	final Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		new Main().init();
	}
	void init(){
		new F();
		//final long STACK_SIZE=8*1024*1024;
		//new Thread(null, new F(), "", STACK_SIZE);
	}
	
	class E{
		E(){
			while(sc.hasNext()){
				int N=sc.nextInt();
				if(N==0)	break;
				solve(N);
			}
		}
		void solve(int N){
			int[] d=new int[N],v=new int[N];
			for(int i=0; i<N; i++){
				d[i]=sc.nextInt();
				v[i]=sc.nextInt();
			}
			long vvv=v[0],ddd=d[0];
			for(int i=1; i<N; i++){
				long vv=v[i]*vvv;
				long d1=d[i]*vvv,d2=ddd*v[i];
				long d3=lcm(min(d1,d2),max(d1,d2));
				long gcd=gcd(d3,vv);
				vvv=vv/gcd;
				ddd=d3/gcd;
			}
			for(int i=0; i<N; i++){
				System.out.println(((long)v[i]*ddd/vvv)/(long)d[i]);
			}
		}
		long gcd(long x,long y){
			if(y==0)	return x;
			return gcd(y,x%y);
		}
		long lcm(long x,long y){
			return x/gcd(x,y)*y;
		}
	}
	class F implements Runnable{
		@Override public void run() {
			while(sc.hasNext()){
				int N=sc.nextInt();
				if(N==0)	break;
				System.out.println(solve(N)?"OK":"NG");
			}
		}
//		F(){}
		F(){
			while(sc.hasNext()){
				int N=sc.nextInt();
				if(N==0)	break;
				System.out.println(solve(N)?"OK":"NG");
			}
		}
		
		boolean solve(int N){
			String[] s=new String[N];
			for(int i=0; i<N; i++)	s[i]=sc.next();
			ArrayList<ArrayList<State1>> head=new ArrayList<ArrayList<State1>>(),
										tail=new ArrayList<ArrayList<State1>>();
			for(int i=0; i<(int)'z'-'a'; i++){
				head.add(new ArrayList<State1>());
				tail.add(new ArrayList<State1>());
			}
			for(int i=0; i<N; i++){
				head.get(s[i].charAt(0)-'a').add(new State1(i,s[i]));
				tail.get(s[i].charAt(s[i].length()-1)-'a').add(new State1(i,s[i]));
			}
			
			// TODO ok
			//System.out.println("head\n"+head);
			//System.out.println("tail\n"+tail);
			
			for(int i=0; i<(int)'z'-'a'; i++){
				boolean[] used=new boolean[N];
				for(int j=0; j<head.get(i).size(); j++){
					State1 h=head.get(i).remove(0);
					used[h.idx]=true;
					for(int k=0; k<tail.get(h.str.charAt(0)-'a').size(); k++){
						State1 t=tail.get(h.str.charAt(0)-'a').remove(0);
						// TODO ok
						//System.out.println("START2"+h+" "+t);
						if(!used[t.idx]){
							used[t.idx]=true;
							// TODO ok
							//System.out.println("START"+h+" "+t);
							if(DFS(N-2,head,tail,h.str.charAt(h.str.length()-1),t.str.charAt(0),used)){
								return true;
							}
							used[t.idx]=false;
						}
						tail.get(h.str.charAt(0)-'a').add(t);
					}
					head.get(i).add(h);
					used[h.idx]=false;
				}
			}
			return false;
		}
		boolean DFS(int remain,ArrayList<ArrayList<State1>> head,
						ArrayList<ArrayList<State1>> tail,char e,char s,boolean[] used){
			if(remain<=2){
				// TODO ok
				//System.out.println("END r:"+remain+" e:"+e+" s:"+s);
				if(head.get(e-'a').size()<=0)	return false;
				if(tail.get(s-'a').size()<=0)	return false;
				return true;
			}
			int N=head.get(e-'a').size(),M=tail.get(s-'a').size();
			LinkedList<State1> hstack=new LinkedList<State1>();
			for(int i=0; i<N; i++){
				hstack.push(head.get(e-'a').remove(0));
				if(used[hstack.peek().idx])	continue;
				char ee=hstack.peek().str.charAt(hstack.peek().str.length()-1);
				used[hstack.peek().idx]=true;
				LinkedList<State1> tstack=new LinkedList<State1>();
				for(int j=0; j<M; j++){
					tstack.push(tail.get(s-'a').remove(0));
					if(used[tstack.peek().idx])		continue;
					char ss=tstack.peek().str.charAt(0);
					used[tstack.peek().idx]=true;
					if(DFS(remain-2,head,tail,ee,ss,used))	return true;
					tail.get(s-'a').add(tstack.peek());
					used[tstack.pop().idx]=false;
				}
				for(State1 s1:tstack)	tail.get(s-'a').add(s1);
				head.get(e-'a').add(hstack.peek());
				used[hstack.pop().idx]=false;
			}
			for(State1 s1:hstack) head.get(e-'a').add(s1);
			return false;
		}
		class State1{
			int idx;
			String str;
			State1(int idx,String str){
				this.idx=idx;
				this.str=str;
			}
			@Override public String toString(){
				return "("+idx+":"+str+")";
			}
		}
	}
	

}