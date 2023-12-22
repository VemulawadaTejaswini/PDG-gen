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
		int M=sc.nextInt();
		
		
		
		for(int i=0;i<M;i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			
			if(!map.containsKey(a)) {
				map.put(a, new ArrayList<Integer>());
			}
			if(!map.containsKey(b)) {
				map.put(b, new ArrayList<Integer>());
			}
			map.get(a).add(b);
			map.get(b).add(a);
		}
		
		
		int v[]=new int[N];
		Queue<Integer> qq=new ArrayDeque<>(); 
		
		qq.add(1);
		while(qq.peek()!=null) {
			int t=qq.poll();
			ArrayList<Integer> cc=map.get(t);
			for(int i:cc) {
				if(v[i-1]==0) {
					v[i-1]=t;
					qq.add(i);
					
				}
			}
		}
		p("Yes");
		for(int i=1;i<N;i++) {
				p(v[i]);
		}
		
		
	}
	public static Map<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>(20001);	
		
	//static int ans=10000009;
	
		
	
	
	
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
	
