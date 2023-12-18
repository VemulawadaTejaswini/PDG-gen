import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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

//ArrayList<String> cc = new ArrayList<>(n);
//Collections.sort(list);
//Array.sort(list);
//Arrays.asList(c).contains("a")
//list.set(1,"walk");
public class Main {
	private static Scanner sc = new Scanner(System.in);
	static void p(String ans) {System.out.println(ans);};
	static void p(int ans) {System.out.println(ans);};
	static void p(long ans) {System.out.println(ans);};
	static void p(double ans) {System.out.println(ans);};
	static String s;
	public static void main(String[] args) {
		s=sc.next();
		
		dfs(s.length()-1,s);
		long ans=0;
		for(String a:cc) {
			a=a+"+";
			String[] tmp=a.split("\\+");
			for(String i:tmp) {
				ans+=Long.parseLong(i);
			}
		}
		p(ans);
	}
	
	static int g=0;
	static int dfs(int i,String g) {
		StringBuilder str = new StringBuilder(g);
		if(i<=0) {
			cc.add(str.toString());
			return 0;
		}
		dfs(i-1,str.toString());
		dfs(i-1,str.insert(i,"+").toString());
		return 0;
		
	}
	static ArrayList<String> cc=new ArrayList<String>(100000);

	
	
	
}
