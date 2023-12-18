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
		long A=sc.nextLong();
		long B=sc.nextLong();
		long C=sc.nextLong();
		long ctn=0;
		long t1,t2,t3;
		if(A==B&&A==C) {
			p(-1);
		}else {
			while(A%2==0&&B%2==0&&C%2==0) {
			t1=A/2;
			t2=B/2;
			t3=C/2;
			A=t2+t3;
			B=t1+t3;
			C=t1+t2;
			ctn++;
			if(A==B&&A==C) {
				p(-1);
				break;
			}
			}
			if(A==B&&A==C) {
			}else{
				p(ctn);
			}
		}
		
	}
}
