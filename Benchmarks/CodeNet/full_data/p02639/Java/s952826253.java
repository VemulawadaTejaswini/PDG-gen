import java.util.*;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int E = sc.nextInt();
		if (A == 0) {
			System.out.println(1);
		} else if (B == 0) {
			System.out.println(2);
		} else if (C == 0) {
			System.out.println(3);
		} else if (D == 0) {
			System.out.println(4);
		} else {
			System.out.println(5);
		}
	}
}