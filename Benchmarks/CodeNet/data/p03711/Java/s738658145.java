import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		Integer[] A = {1, 3, 5, 7, 8, 10, 12};
		Integer[] B = {4, 6, 9, 11};
		Integer[] C = {2};
		
		if(Arrays.asList(A).contains(a) && Arrays.asList(A).contains(b)
				|| Arrays.asList(B).contains(a) && Arrays.asList(B).contains(b)
				|| Arrays.asList(C).contains(a) && Arrays.asList(C).contains(b)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}