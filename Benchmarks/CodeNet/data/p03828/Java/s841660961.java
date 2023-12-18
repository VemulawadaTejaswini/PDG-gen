import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	
	static long mod = (long)1e9+7;
	
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int N = scan.nextInt();
			/*
			for(Integer key:s.keySet()) {
				System.out.print(key);
				System.out.print(" ");
				System.out.println(s.get(key));
			}*/
			
			Map<Integer,Integer>sum = new TreeMap<Integer,Integer>();
			
			
			for(int i= N;i>=1;i--) {
				Map<Integer,Integer> s = primefact(i);
				
				for(Integer key:s.keySet()) {
					if(sum.containsKey(key)) {//含まれている
						sum.put(key, sum.get(key)+s.get(key));
					}else {
						sum.put(key, s.get(key));
					}
				}
			}
			
			long goukei = 1;
			
			for(Integer key:sum.keySet()) {
				
				goukei = (goukei*(sum.get(key)+1))%mod;
				
				/*
				System.out.print(key);
				System.out.print(" ");
				System.out.println(sum.get(key));
				*/
			}
			
			System.out.println(goukei);
			
			
			
			
		}
		
		
	}
	
	
	
	/*for(Integer key:A.keySet()) {
	System.out.println(key);//素数
	System.out.println(A.get(key));//素数の指数
	}みたいな感じで表示できる*/	
	private static Map<Integer,Integer> primefact(int n){//入力ｎの素数とその指数をmapに格納
		Map<Integer,Integer> map = new TreeMap<Integer,Integer>();
		for(int i = 2;i*i<=n;i++) {
			if(n%i!=0) {
				continue;
			}
			int ex = 0;//素因数分解した素数たちの指数
			
			while (n % i == 0) {//iでわれる限りやる
				++ex;
				n /= i;
				}		
			map.put(i, ex);//(素数、その素数の指数)
		}
		if(n!=1) {//もし最後に素数が残ったら入れておく
			map.put(n, 1);
		}
		return map;
	}
		

}
