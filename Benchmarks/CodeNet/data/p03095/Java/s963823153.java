import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
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
	static long mod =1000000007;
	//static 	ArrayList<Integer> cc = new ArrayList<>(100);
	
	
	public static void main(String[] args) {
		//int N=sc.nextInt();for(int i=0;i<N;i++) {}
		//int a[]=new int[N];
		//Ae2+Be2=Ce2
		//StringBuffer str = new StringBuffer(hoge1);
		//for(int i=0;i<N;i++) {}
		
		//int N=sc.nextInt();for(int i=0;i<N;i++) {}
		int N=sc.nextInt();
		String S=sc.next();
		long  v[]=new long[26];
		for(int i=0;i<N;i++) {
			v[S.charAt(i)-97]++;
		}
		long T=modPow(2,N);
		long P=0;
		Queue<Long> qq=new ArrayDeque<>();
		Queue<Long> qq2=new ArrayDeque<>();
		
		for(int i=0;i<26;i++) {
			P%=mod;
			if(v[i]<=1)continue;
			long x=v[i]*v[i];
			if(qq.peek()!=null) {
				while(qq.peek()!=null) {
					long a=qq.poll();
					P-=(T/(a*x));
					qq2.add(a*x);
				}
				P+=(T/x);
				qq2.add(x);
			}else {
				while(qq2.peek()!=null) {
					long a=qq2.poll();
					P-=(T/(a*x));
					qq.add(a*x);
				}
				P+=(T/x);
				qq.add(x);
			}
			
			
		}
		
		T-=P+1;;
		if(T<0)T+=mod;
		p(T);
	}
	
		
	
	
		
	
	public static long modPow(int g,int N) {
		long T=1;
		for(int i=0;i<N;i++) {
			T*=g;
			T%=mod;
		}
		return T;
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
	
