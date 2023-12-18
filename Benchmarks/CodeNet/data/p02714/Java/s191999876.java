import java.util.ArrayList;
import java.util.Scanner;
 


public class Main {
	static int a1[]= {0,-1,0,1};
	static int b1[]= {-1,0,1,0};
	private static Scanner sc = new Scanner(System.in);
	private static Scanner s = new Scanner(System.in);
	static void p(String ans) {System.out.println(ans);};
	static void p(int ans) {System.out.println(ans);};
	static void p(long ans) {System.out.println(ans);};
	static void p(double ans) {System.out.println(ans);};
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
	//Array.sort(list);
	//Arrays.asList(c).contains("a")
	//list.set(1,"walk");
	public static void main(String[] args) {
		int N=s.nextInt();			
		String S=s.next();
		char v;//82 71 66
		int R[]=new int[N];
		int G[]=new int[N];
		int B[]=new int[N];
		int rr=0,gg=0,bb=0;
		for(int i=0;i<N;i++) {
			v=S.charAt(i);
			if(v==82)rr++;
			if(v==71)gg++;
			if(v==66)bb++;
			R[i]=rr;
			G[i]=gg;
			B[i]=bb;
		}
		long ans=0;
		char a,b,c=0;
		
		for(int i1=0;i1<N;i1++) {
			a=S.charAt(i1);
			for(int i2=i1+1;i2<N;i2++) {
				b=S.charAt(i2);
				if(a==b)continue;
				if(a!=82&&b!=82) {
					c=82;//R
					ans+=R[N-1]-R[i2];
				}
				else if(a!=71&&b!=71) {
					c=71;//G
					ans+=G[N-1]-G[i2];
				}
				else if(a!=66&&b!=66) {
					c=66;//B
					ans+=B[N-1]-B[i2];
				}
				if(i2*2-i1<N&&S.charAt(i2*2-i1)==c) {
					ans--;
				}
			}
		}
	
		
		
		p(ans);
				
		
	}
	public static int gcd(int num1,int num2) {
        if(num2==0) return num1;
        else return gcd(num2,num1%num2);
    }
}
