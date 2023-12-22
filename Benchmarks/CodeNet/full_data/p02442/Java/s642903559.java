import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arrA = new int[n];
		for (int i = 0; i < n; i++) {
		    arrA[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int[] arrB = new int[m];
		for (int i = 0; i < m; i++) {
		    arrB[i] = sc.nextInt();
		}
		for (int i = 0; i < n && i < m; i++) {
		    if (arrA[i] < arrB[i]) {
		        System.out.println(1);
		        return;
		    } else if (arrA[i] > arrB[i]) {
		        System.out.println(0);
		        return;
		    }
		}
		if (n < m) {
		    System.out.println(1);
		} else {
		    System.out.println(0);
		}
	}
}

