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
	static int a[]= {0,-1,0,1};
	static int b[]= {-1,0,1,0};
	private static Scanner sc = new Scanner(System.in);
	static void p(String ans) {System.out.println(ans);};
	static void p(int ans) {System.out.println(ans);};
	static void p(long ans) {System.out.println(ans);};
	static void p(double ans) {System.out.println(ans);};
	static int K;
	public static void main(String[] args) {
		K=sc.nextInt();
		for(int i=1;i<=K;i++) {
			if(i<10) {
				cc.add(i+"");
				continue;
			}else {
				dfs(cc.get(i-10));
			}
			if(cc.size()==K) {
				break;
			}
		}
		p(cc.get(K-1));
	}
	static ArrayList<String> cc=new ArrayList<>(10001);
	static int t[]={-1,0,1};
	
	//次のルンルン数を返す関数
	static void dfs(String s) {
		for(int a=0;a<3;a++) {
			if(s.charAt(s.length()-1)==48&&a==0) continue;
			if(s.charAt(s.length()-1)==57&&a==2) continue;
			String v=s+(s.charAt(s.length()-1)-48+t[a]);
			cc.add(v);
			if(cc.size()==K)break;
		}
		
	}
}
