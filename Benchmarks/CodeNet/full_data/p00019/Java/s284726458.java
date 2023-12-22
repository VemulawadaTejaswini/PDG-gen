import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		int sum = 1;
		
		n  =sc.nextInt();
		while (0 < n) {
			sum *= n;
			n--;
		}
		
		System.out.println(sum);
	}
}