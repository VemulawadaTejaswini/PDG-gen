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
		int K=s.nextInt();			
		long ans=0;
		for(int a=1;a<=K;a++) {
			for(int b=1;b<=K;b++) {
				for(int c=1;c<=K;c++) {
					ans+=gcd(a,gcd(b,c));
				}
			}
		}
		p(ans);
		/*int N=sc.nextInt();
		for(int i=0;i<N;i++) {
			int x=sc.nextInt();
		}*/
		
		
		
				
		
	}
	public static int gcd(int num1,int num2) {
        if(num2==0) return num1;
        else return gcd(num2,num1%num2);
    }
}
