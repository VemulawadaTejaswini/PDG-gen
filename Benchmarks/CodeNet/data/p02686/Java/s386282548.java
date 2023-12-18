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
		
		String S[]=new String[N];
		//( 40 || //) 41 
		boolean x=false;
		boolean y=false;
		int tt=0;
		
		int a[]=new int[2];
		for(int i=0;i<N;i++) {
			S[i]=sc.next();
			
			
			for(int f=0;f<S[i].length();f++) {
				a[S[i].charAt(f)-40]++;
			}
			
			if(S[i].charAt(S[i].length()-1)==41&&S[i].charAt(0)==40) {
				
				tt++;
				
			}else
			if(S[i].charAt(0)==40) {
				x=true;
			}else
			if(S[i].charAt(S[i].length()-1)==41) {
				y=true;
			}
		}
			if((x&&y)||(tt==1&&(x||y))||(tt>=2)) {
				
				if(a[0]==a[1])p("Yes");
				else p("No");
				
				
			}else {
				p("No");
			}
			
			
		}
		
		
	
	
	
	static int dfs(int i) {
		
		
		
		
		
		return 0;
	}
	
	
	

	


	
	static void p(String ans) {System.out.println(ans);};
	static void p(int ans) {System.out.println(ans);};
	static void p() {System.out.println();};
	static void p(long ans) {System.out.println(ans);};
	static void p(double ans) {System.out.println(ans);};
	
}
	
