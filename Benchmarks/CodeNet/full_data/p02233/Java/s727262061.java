import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		int n = sc.nextInt();

		// ボトムアップ型、メモリ節約
		int cache_2 = 1;
		int cache_1 = 1;
		int ret = 1;
		for (int i = 2; i <= n; i++) {
			ret = cache_1 + cache_2;
			cache_2 = cache_1;
			cache_1 = ret;
		}
		
		System.out.println(ret);
		
         sc.close();
	}
}