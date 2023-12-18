import java.util.*;

public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a = m / n;
		int mod = m % n;
		int value = Integer.MAX_VALUE;
		for (int i = 0; i < a; i++) {
			value = a - i;
			int b = a + mod + i * (n - 1);
			if (b % value == 0) {
				break;
			}
		}
		System.out.println(value);
	}
	
}