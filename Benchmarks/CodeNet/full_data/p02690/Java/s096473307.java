import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			
			int X = scan.nextInt();
			
			long A = 0;
			long B = 0;
			
			long x = 0;
			long y = 0;
			
			
			ArrayList<Integer>yakusu = enum_div(X);
			
			
			//System.out.println(yakusu.size());
			
			for(int i = 0;i<yakusu.size();i++) {
				A = yakusu.get(i);
				B = X/A;
				int k =-10000;
				while(true) {
					long z = A*A*A*A+5*(k+A)*k*(A*A+(k+A)*k);
					if(z==B) {
						System.out.println(k);
						System.out.println(k+A);
						System.exit(0);
					}
					k++;
				}
				
				
			}
			
			
		}
		
		
	}
	
	
	private static ArrayList<Integer> enum_div(int n){//数字１〜ｎまでの約数を全部Allaylistに詰め込むメソッド
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for(int i = 1;i*i<=n;i++) {
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
