import java.util.ArrayDeque;
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
		int H=sc.nextInt();
		int W=sc.nextInt();
		//# 35 
		char v[][]=new char[H][W];
		
		for(int a=0;a<H;a++) {
			String t=sc.next();
			v[a]=t.toCharArray();
		}
		int t=0;
		for(int a=0;a<H;a++) {
			for(int b=0;b<W;b++) {
				if(v[a][b]==35)t++;
			}
		}
		Queue<Integer> qq=new ArrayDeque<>(); //add,poll,peek
		Queue<Integer> qq2=new ArrayDeque<>(); 
		Queue<Integer> qq3=new ArrayDeque<>();
		qq.add(0);
		qq2.add(0);
		qq3.add(1);
		boolean x=false;
		while(qq.peek() != null) {
			int a=qq.poll();
			int b=qq2.poll();
			int c=qq3.poll();
			if(a==H-1&&b==W-1) {
				if(c==t) {
					x=true;
					
					break;
				}
				
				
			}
			if(a+1<H&&v[a+1][b]==35) {
				qq.add(a+1);
				qq2.add(b);
				qq3.add(c+1);
			}
			if(b+1<W&&v[a][b+1]==35) {
				qq.add(a);
				qq2.add(b+1);
				qq3.add(c+1);
			}
			
			
		}
		if(x)p("Possible");
		else p("Impossible");
		}
		
		
	

	

	public static long gcd(long a, long b) {
        return b == 0 ? a: gcd(b, a % b);
	}
	public static long lcm(long n, long m) {
        return n / gcd(n, m) * m;
}
	
	

	


	
	static void p(String ans) {System.out.println(ans);};
	static void p(int ans) {System.out.println(ans);};
	static void p() {System.out.println();};
	static void p(long ans) {System.out.println(ans);};
	static void p(double ans) {System.out.println(ans);};
	
}
	
