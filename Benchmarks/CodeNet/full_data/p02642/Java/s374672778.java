import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int N = scan.nextInt();
			int[]A = new int[N];
			Map<Integer,Integer>map = new TreeMap<Integer,Integer>();
			for(int i = 0;i<N;i++) {
				A[i] = scan.nextInt();
				if(map.containsKey(A[i])) {
					map.put(A[i], 0);
				}else{
					map.put(A[i], 1);
				}
			}
			
			
			
			int count = 0;
			
			Arrays.sort(A);
			
			
			ArrayList<Integer>B = new ArrayList<Integer>();
			
			for(Integer key:map.keySet()) {
				if(map.get(key)==1) {
					B.add(key);
				}
			}
		
			
			
			
			if(N==1) {
				System.out.println(0);
				System.exit(0);
			}
			Set<Integer>set = new TreeSet<Integer>();
			
			for(int i = 0;i<B.size();i++) {
				ArrayList<Integer> as = enum_div(B.get(i));
				int ok=1;
				for(int j = 1;j<as.size();j++) {
					if(set.contains(as.get(j))) {
						ok=0;
						break;
					}
				}
				
				if(ok==1) {
					set.add(B.get(i));
					count++;
				}else{
					
				}
				
				
			}
			
			System.out.println(count);
			
			
			
			
			
			
			
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
