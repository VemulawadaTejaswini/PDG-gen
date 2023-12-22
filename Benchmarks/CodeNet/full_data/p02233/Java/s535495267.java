import java.util.Scanner;


public class Main {
	
	private static int[] cache;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		int n = sc.nextInt();

		// 再帰的トップダウン型、履歴管理
		cache = new int[n + 1];
		cache[0] = 1;
		cache[1] = 1;
		int ret = fibonacciNum(n);
		
		System.out.println(ret);
		
         sc.close();
	}
	
	private static int fibonacciNum(int n) {
		if (cache[n] != 0) {
			return cache[n];
		}
		
		cache[n] = fibonacciNum(n - 1) + fibonacciNum(n - 2);
		return cache[n];
	}
}