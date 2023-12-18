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
		
			for(Long i:a) {//Aの約数の数分チェック
				if(B%i==0) {
					C.add(i);
					D.add(i);
				}
			}
			
		
			if(C.size()==1) {
				System.out.println(1);
				return;
			}
			
			Iterator<Long> itI = D.iterator();
			while(itI.hasNext()) {
				long k = itI.next();
				if(!itI.hasNext())break;
				Iterator<Long> itJ = itI;
				while(itJ.hasNext()) {
					long s = itJ.next();
					if(s%k==0)D.remove(s);
				}
			}
			
			/*
			for(int i = 1;i<C.size()-1;i++) {
				long ki = C.get(i);
				for(int j = i+1;j<C.size();j++) {
					long che = C.get(j);
					if(che%ki==0) {
						D.remove(che);
					}
				}
			}*/
		
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
	
	
	

}
