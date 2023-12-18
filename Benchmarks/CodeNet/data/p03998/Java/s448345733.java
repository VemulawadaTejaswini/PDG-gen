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
		StringBuffer a=new  StringBuffer(sc.next());
		StringBuffer b=new  StringBuffer(sc.next());

		StringBuffer c=new  StringBuffer(sc.next());

		
		
		
		StringBuffer v[]=new  StringBuffer[3];
		
		
		v[0]=a;
		v[1]=b;
		v[2]=c;
		//a 97 || //b 98 || //c 99 || 
		//A 65 || //B 66 || //C 67 || 
		char x=97;
		while(true) {
			if(v[x-97].length()==0) {
				x-=32;
				p(x+"");
				break;
			}
		//	p(x+"");
			char f=v[x-97].charAt(0);
			v[x-97].delete(0, 1);
			x=f;
			
			
		}
		
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
	
