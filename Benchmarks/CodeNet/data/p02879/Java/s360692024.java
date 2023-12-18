import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();

		if (1 <= A && A <= 9 && 1 <= B && B <= 9) {
			System.out.print(A * B);
		}else {
			System.out.print("-1");			
		}

	}
}
