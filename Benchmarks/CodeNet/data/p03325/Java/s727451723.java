import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int N = scan.nextInt();
			int[]a = new int[N];
			int goukei = 0;
			
			for(int i = 0;i<N;i++) {
				a[i] = scan.nextInt();
				Map<Integer,Integer> map  = primefact(a[i]);
				
				if(map.get(2)!=null) {
					goukei+=map.get(2);
				}		
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
