import java.util.*;

public class Main {
	public static void main (String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] arr = sc.next().toCharArray();
		if (n % 2 == 1) {
		    System.out.println("No");
		    return;
		}
		for (int i = 0; i < n / 2; i++) {
		    if (arr[i] != arr[i + n / 2]) {
		        System.out.println("No");
		        return;
		    }
		}
		System.out.println("Yes");
	}
}
