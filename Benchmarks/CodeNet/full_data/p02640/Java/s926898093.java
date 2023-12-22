import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
 		Scanner scanner = new Scanner(System.in);
 		int A = scanner.nextInt();
 		int B = scanner.nextInt();
 		int n = A * 4;
 		int m = (n - B) / 2;
 		int l = (n - B) % 2;
 		if (l == 0) {
 			if (m <= A && m >= 0) {
 				System.out.println("Yes");
 			} else {
 				System.out.println("No");
 			}
 		} else {
 			System.out.println("No");
 		}
 	}
 }