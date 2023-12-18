import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main{
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			long A = scan.nextLong();
			long B= scan.nextLong();
			
			ArrayList<Long>a = enum_div(A);
			ArrayList<Long>C = new ArrayList<Long>();
			ArrayList<Long>D = new ArrayList<Long>();
			ArrayList<Long>E = new ArrayList<Long>();
			StringBuffer sb = new StringBuffer();
			
			for(Long i:a) {//Aの約数の数分チェック
				if(B%i==0) {
					C.add(i);
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
						sb.replace(j, j+1, "0");
					}
				}
			}
			
			int count = 0;
			
			for(int i=0;i<sb.toString().length();i++) {
				String s = sb.toString().substring(i, i+1);
				if(s.equals("1")) {
					count++;
				}
			}
			
			
				System.out.println(count);
				
			
			
			
			
			
			
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
	
	

}
