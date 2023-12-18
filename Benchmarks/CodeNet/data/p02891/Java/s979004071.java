import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;
 


public class Main {
	private static Scanner sc = new Scanner(System.in);
	//result = Math.pow(num1, num3)
	//StringBuffer str = new StringBuffer(hoge1);
	//String hoge2 = str.reverse().toString();
	//map.containsKey(A)

	//Map<String, Integer> map = new HashMap<String, Integer>(n);
	/*for ( キーのデータ型 key : マップの名前.keySet() ) {
		データのデータ型 data = マップの名前.get( key );
		
		// keyやdataを使った処理;
	}*/
	//int i = Integer.parseInt(s);
	//Queue<String> qq=new ArrayDeque<>(); //add,poll,peek
	//Deque<String> qq=new ArrayDeque<>();//push,pop,peek
	//ArrayList<String> cc = new ArrayList<>(n);
	//Collections.sort(list);
	//Array.sort(list);   cc.contains(tmp)
	//Arrays.asList(c).contains("a")
	//list.set(1,"walk");//1 1 2 3 5
	//static long mod =1000000007;
	//static 	ArrayList<Integer> cc = new ArrayList<>(100);
	
	
	
	
	public static void main(String[] args) {
		//int N=sc.nextInt();for(int i=0;i<N;i++) {}
		//int a[]=new int[N];
		//Ae2+Be2=Ce2
		String S=sc.next();
		long K=sc.nextLong();
		
		
		char a[]=S.toCharArray();
		
		long ans=0;
		boolean x=true;
		
		for(int i=0;i<S.length();i++) {
			if(a[i]!=a[0]) {
				x=false;
				break;
			}
		}
		if(x) {
			p((long)K*(long)S.length()/2);
		}
		
		
		
		
		
		
		if(!x) {
			if(a[0]==a[S.length()-1]) {
				long tt=1;
				long tt2=1;
				int i=1;
				while(true) {
					if(a[0]!=a[i])break;
					tt++;a[i]=0;
					i++;
					
				}
				i=S.length()-2;
				while(true) {
					if(a[0]!=a[i])break;
					tt2++;a[i]=0;
					i--;
				}
				ans+=tt/2;
				ans+=tt2/2;
				ans+=((tt+tt2)/2)*(K-1);
			
			}
		for(int i=0;i+1<S.length();i++) {
			if(a[i]==0)continue;
			if(a[i]==a[i+1]) {
				long t=2;
				while(i+1<S.length()) {
					i++;
					
					if(a[i]!=a[i+1]) {
						break;
					}
					if(i+1==S.length()) {
						t=0;
						break;
					}
					t++;
					
				}
				ans+=(t/2)*K;
			}
		}
		
			p(ans);
		}
		
		
		}
		
		
	
	
	
	public static long lcm(long a, long b) {
        return a / gcd(a, b) * b;
	}
	
	public static long gcd(long a, long b) {
        return b == 0 ? a: gcd(b, a % b);
	}

	


	
	static void p(String ans) {System.out.println(ans);};
	static void p(int ans) {System.out.println(ans);};
	static void p() {System.out.println();};
	static void p(long ans) {System.out.println(ans);};
	static void p(double ans) {System.out.println(ans);};
	
}
	
