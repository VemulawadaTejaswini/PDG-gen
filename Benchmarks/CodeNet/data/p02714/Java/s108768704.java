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
		
		/*int N=sc.nextInt();
		for(int i=0;i<N;i++) {
			int x=sc.nextInt();
		}*/
		int ans=0;
		char a,b,c;
		for(int i=0;i<N;i++) {
			a=S.charAt(i);
			for(int d=i+1;d<N;d++) {
				b=S.charAt(d);
				if(a==b)continue;
				for(int e=d+1;e<N;e++) {
					if(d-i==e-d)continue;
					c=S.charAt(e);
					if(a==c||b==c)continue;
					ans++;
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
