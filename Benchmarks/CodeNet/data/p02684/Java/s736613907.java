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
		
		int N=sc.nextInt();
		long K=sc.nextLong();
		boolean v[]=new boolean[N];
		int t[]=new int[N];
		for(int i=0;i<N;i++) {
			t[i]=sc.nextInt()-1;
		}
		
		int f=0;
		int ctn=0;
		
		while(true) {
			if(v[f]) {
				break;
			}
			ctn++;
			v[f]=true;
			
			f=t[f];
		}
		int g=f;
		int ctn2=0;
		//p(" "+f);
		int ans[]=new int[N];
		while(true) {
			ans[ctn2]=g;
			
			ctn2++;
			g=t[g];
			if(g==f) {
				break;
			}
			
		}
		//p(ctn);
		//p(ctn+" "+ctn2);
		long x=((K-ctn)%ctn2);
		p((ans[(int)x]+1));
		//p(ctn2);
		
	}
	
	
	

	


	
	static void p(String ans) {System.out.println(ans);};
	static void p(int ans) {System.out.println(ans);};
	static void p() {System.out.println();};
	static void p(long ans) {System.out.println(ans);};
	static void p(double ans) {System.out.println(ans);};
	
}
	
