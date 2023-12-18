import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = 0;
		for(int i=0; i<2; i++) {
			sum += Math.max(a, b);
		}
		System.out.println(sum);
	}
}
