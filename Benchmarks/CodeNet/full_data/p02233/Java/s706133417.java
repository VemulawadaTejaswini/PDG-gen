import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer n = sc.nextInt();
		int[] result = new int[45];
		result[0] = 1;
		result[1] = 1;
		System.out.println(fib(n, result));
	}

//	public static Integer fib(Integer n, int[] result) {
//		Integer ret;
//		if(result[n] == 0) {
//			ret = fib(n -1, result) + fib(n - 2, result);
//			result[n] = ret;
//		}
//		else {
//			ret = result[n];
//		}
//		return ret;
//	}

	public static Integer fib(Integer n, int[] result) {
		for(int i = 2; i <= n; i++) {
			result[i] = result[i - 1] + result[i -2];
		}
		return result[n];
	}
}

