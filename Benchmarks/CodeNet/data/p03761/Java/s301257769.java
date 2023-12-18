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
		int N=sc.nextInt();
		String S[]=new String[N];
		
		int v[]=new int[30];
		
		for(int i=0;i<N;i++) {
			S[i]=sc.next();
			int vv[]=new int[30];
			for(int a=0;a<S[i].length();a++) {
				vv[S[i].charAt(a)-97]++;
			}
			
			for(int c=0;c<30;c++) {
				v[c]=Math.min(v[c], vv[c]);
				if(i==0) {
					v[c]=vv[c];
				}
			}
			
			
		}
		StringBuffer str = new StringBuffer();
		for(int  i=0;i<30;i++) {
			
			for(int a=0;a<v[i];a++) {
				
				str.append((char)(i+97));
			}
		}
		p(str.toString());
		
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
	
