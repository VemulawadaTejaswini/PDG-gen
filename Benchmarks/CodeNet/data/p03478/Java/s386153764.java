import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			int c = 0, d = i;
			for(int j = 1; j < 5; j++) {
				c += d % 10;
				d /= 10;
			}
			if(a <= c && c <= b) {
				sum += i;
			}
		}
		System.out.print(sum);
	}
}