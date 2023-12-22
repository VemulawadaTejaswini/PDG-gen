import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		
		long n = scan.nextLong();
		
		ArrayList<Long> array = new ArrayList<Long>();
		long total = 0;
		
		for( int i = 0; i < n; i++) {
			array.add(scan.nextLong());
			total += array.get(i);
		}
		
		
		/*
		for(int i = 0; i < n-1; i++) {
			if(total >= 1000000007) {
				total -= 1000000007;
			}
			for(int j = i+1; j < n; j++) {
				
				total += array.get(i) * array.get(j);
				
				long a = total %  1000000007;
				
				total = a;
				
				if(total >= 1000000007) {
					total -= 1000000007;
				}
				
			}
		}*/
		
		long mod = 1000000007;
		long ans = 0;
		
		for(int i = 0; i < n-1; i++) {
			total -= array.get(i);
			long a = total % mod;
			ans += array.get(i) * a;
			ans %= mod;
		}
		
		System.out.print(ans);
	}

}