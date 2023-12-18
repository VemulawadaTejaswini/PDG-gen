import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
 

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
public class Main {
	static int a1[]= {0,-1,0,1};
	static int b1[]= {-1,0,1,0};
	private static Scanner sc = new Scanner(System.in);
	static void p(String ans) {System.out.println(ans);};
	static void p(int ans) {System.out.println(ans);};
	static void p(long ans) {System.out.println(ans);};
	static void p(double ans) {System.out.println(ans);};
	static int K;
	public static void main(String[] args) {
		int N=sc.nextInt();
		double v=N/1.08;
		int a=(int)Math.ceil(v);
		int b=(int)Math.floor(v);
		//p(v);
		//p(a);
		if(Math.floor(a*1.08)==N) {
			p(a);
		}else if(Math.floor(b*1.08)==N) {
			p(b);
		}else {
			p(":(");
		}
	}
}
