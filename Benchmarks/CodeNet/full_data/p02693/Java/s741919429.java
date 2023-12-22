import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int K = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if (Check(K, A, B) == true) {
			System.out.println("OK");
		} else {
			System.out.println("NG");
		}
	}
	
	public static boolean Check(int k, int a, int b) {
		boolean result = false;
		
		for (int i = a; i <= b; i++) {
			if (i % k == 0) {
				result = true;
				break;
			}
		}
		
		return result;
	}
}
