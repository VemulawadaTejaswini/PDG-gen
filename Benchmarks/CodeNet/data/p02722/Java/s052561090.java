import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
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
		long vv=sc.nextLong();

		Map<Long, Integer> map = new HashMap<Long, Integer>();
		Map<Long, Integer> map2 = new HashMap<Long, Integer>();
		ArrayList<Long> cc = new ArrayList<>();
		ArrayList<Long> cc2 = new ArrayList<>();
		for(long i=1;Math.pow(i,2)<vv;i++) {
			if(vv%i==0) {
				if(i!=1)cc.add(i);
				cc.add(vv/i);
			}
		}
		
		for(long i=1;Math.pow(i, 2)<vv-1;i++) {
			if((vv-1)%i==0) {
				if(i!=1)cc.add(i);
				cc.add((vv-1)/i);
			}
		}
		Collections.sort(cc);
		int ctn=0;
		for(long i:cc) {
			long v=vv;
			while(v%i==0) {
				v=v/i;
			}
			if(v%i==1) {
				ctn++;
			}
		}
		p(ctn);
	}
	static boolean x(int i,int vv) {
		int f=vv%i;
		p("f"+f+"   vv"+vv+"  i"+i);
		if(vv%i==0) {
			if(x(i,vv/i)) return true;
		}
		else if(vv%i==1) {
			return true;
			
		}else {
			p("f"+f+"   vv"+vv);
			return false;
		}
		return false;
	}
	static int t[]={-1,0,1};
	
	//次のルンルン数を返す関数
	static void dfs() {
		
	}

	

	
	
	
}
