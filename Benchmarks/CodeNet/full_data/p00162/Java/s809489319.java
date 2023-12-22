import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static boolean[] isHamming = new boolean[1000001];
	static int n, m;
	public static void main(String[] args) {
		generateHammingNumber();
		while(read()){
			solve();
		}
	}
	
	static void generateHammingNumber(){
		Arrays.fill(isHamming, false);
		isHamming[1] = true;
		for(int i = 0; i < isHamming.length; i++){
			if( isHamming[i] ){
				if( i*2 <= isHamming.length-1 ) isHamming[i*2] = true;
				if( i*3 <= isHamming.length-1 ) isHamming[i*3] = true;
				if( i*5 <= isHamming.length-1 ) isHamming[i*5] = true;
			}
		}
	}
	
	static boolean read(){
		m = sc.nextInt();
		if( m == 0 )return false;
		n = sc.nextInt();
		return true;
	}
	
	static void solve(){
		int res = 0;
		for(int i = m; i <= n; i++){
			if( isHamming[i] )res++;
		}
		System.out.println(res);
	}

}