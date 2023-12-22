import java.util.*;
import static java.lang.Math.*;
public class Main {
	final Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		new Main().init();
	}
	void init(){
		final long STACK_SIZE=8*1024*1024;
		new Thread(null, new AOJ1180(), "RUN!", STACK_SIZE).start();
		//new Live5015();
	}
	
	class AOJ1180 implements Runnable{
		AOJ1180(){}
		@Override public void run(){
			while(sc.hasNext()){
				int a=sc.nextInt(),L=sc.nextInt();
				if((a|L)==0)	break;
				solve(a,L);
			}
		}
		void solve(int A,int L){
			HashMap<Integer,Integer> a=new HashMap<Integer, Integer>();
			a.put(A,0);
			int i=1,last=A;
			while(true){
				int b=biggest(last,L)-smallest(last,L);
				if(a.containsKey(b)){
					int j=a.get(b);
					System.out.println(j+" "+b+" "+(i-j));
					break;
				}
				a.put(b,i++);
				last=b;
			}
		}
		
		int[] split(int n,int l){
			int[] a=new int[l];
			for(int i=0; i<l; i++){
				a[i]=n%10;
				n/=10;
			}
			Arrays.sort(a);
			return a;
		}
		int biggest(int n,int l){
			int[] a=split(n,l);
			int ret=0;
			for(int i=0; i<l; i++)	ret+=a[i]*(int)pow(10,i);
			return ret;
		}
		int smallest(int n,int l){
			int[] a=split(n,l);
			int ret=0;
			for(int i=0; i<l; i++)	ret+=a[l-i-1]*(int)pow(10,i);
			return ret;
		}
	}
}