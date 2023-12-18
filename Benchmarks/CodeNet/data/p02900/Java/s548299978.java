import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			long A = scan.nextLong();
			long B= scan.nextLong();
			
			ArrayList<Long>a = enum_div(A);
			ArrayList<Long>C = new ArrayList<Long>();
			Set<Long> D = new TreeSet<Long>();
			//ArrayList<Long>D = new ArrayList<Long>();
			ArrayList<Long>E = new ArrayList<Long>();
			StringBuffer sb = new StringBuffer();
			
			for(Long i:a) {//Aの約数の数分チェック
				if(B%i==0) {
					C.add(i);
					D.add(i);
					
				}
			}
			
			
			for(Long i:C) {
				//System.out.println(i);
				//D.add((long)1);
				sb.append(1);
			}
			//System.out.println(COM(170,85));
			
			if(C.size()==1) {
				System.out.println(1);
				return;
			}
			
			
			for(int i = 1;i<C.size()-1;i++) {
				long ki = C.get(i);
				for(int j = i+1;j<C.size();j++) {
					long che = C.get(j);
					if(che%ki==0) {
						//sb.replace(j, j+1, "0");
						D.remove(che);
					}
				}
			}
			/*
			int count = 0;
			
			for(int i=0;i<sb.toString().length();i++) {
				String s = sb.toString().substring(i, i+1);
				if(s.equals("1")) {
					count++;
				}
			}
			*/
			
				System.out.println(D.size());
				
			
			
			
			
			
			
		}
		
		
	}
	
	
	private static ArrayList<Long> enum_div(long n){//数字１〜ｎまでの約数を全部Allaylistに詰め込むメソッド
		ArrayList<Long> ret = new ArrayList<Long>();
		for(long i = 1;i*i<=n;i++) {
			if(n%i==0) {
				ret.add(i);
				if(i*i!=n){
					ret.add(n/i);
				}
			}
		}
		
		//ただここまでだと格納した約数はソートされてない
		
		Collections.sort(ret);//int型、Sting型くらいの格納した奴ならコレクションクラスのソートが使える。
		//ソートしてからcollections.reverseつかえば降順にもできる
		return ret;
		
		
		
	}
	
	//エラストステネスのふるい 配列の要素数で個数、値をSetで格納されてる
		private static Set<Integer> eraststenes(int n){
			//１~nまでの素数をエラストステネスのふるいというアルゴリズムで O(nloglogn)という高速な方法で配列に格納する
			Set<Integer> aray = new TreeSet<Integer>();
			for(int i = 2;i<=n;i++) aray.add(i);//とりあえず全部ふるい入れる
			for(int i = 2;i<=n;i++) {
				if(isprime(i)) {
					for(int j = 2*i;j<=n;j+=i) {
						aray.remove(j);
					}
				}
			}
			return aray;
		}
		
		private static boolean isprime(int x) {//素数判定、入力xが素数かtrue,falseで返す
			int i;
			if(x<2)return false;//まず２より小さいのは素数じゃない
			if(x==2)return true;//２は素数
			if(x%2==0)return false;//２で割り切れたら素数じゃない
			for(i =3;i*i<=x;i = i+2) {//それ以降iで割り切れたら素数じゃない
				if(x%i==0)
					return false;
			}
			return true;//for文回しても割り切れなかったらそれは素数
		}
	
	

}
