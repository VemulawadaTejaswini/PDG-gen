import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(calculation(A));
		arrayList.add(calculation(B));
		arrayList.add(A+B);
		System.out.println(Collections.max(arrayList));
	}
	
	private static int calculation(int input) {
		return input + (input-1);
	}
}
