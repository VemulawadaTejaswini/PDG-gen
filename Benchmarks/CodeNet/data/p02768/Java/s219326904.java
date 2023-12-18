import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		long total = scanner.nextInt();
		long bad1 = scanner.nextInt();
		long bad2 = scanner.nextInt();
		
		long ans =0;
		for(long j=1; j<=total; j++) {
			if(j!=bad1 && j!=bad2) {
				ans += calcC(total,j);				
			}
		}
		System.out.println(ans);
		
	}	
	
	//組み合わせの計算
	public static long calcC(long n, long k) {
		
		return calcn(n)/(calcn(k)*calcn(n-k));
	}
	
	//階乗の計算
	public static long calcn(long n) {
		List<Long> list = new ArrayList<Long>();
		for(long i=1; i<=n; i++) {
			list.add(i);
		}
		long ans =1;
		for(Long ele: list) {
			ans = ans*ele;
		}
		return ans;
	}
	

}