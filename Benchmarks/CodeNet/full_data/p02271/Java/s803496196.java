import java.util.Scanner;
public class Main {
    public static int[] a;
    public static int n;
    public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	n = Integer.parseInt(scan.nextLine());
	a = new int[n];
	String[] inputA = scan.nextLine().split(" ");
	for (int i = 0; i < n; i++) {
	    a[i] = Integer.parseInt(inputA[i]);
	}
	int q = Integer.parseInt(scan.nextLine());
	int[] m = new int[q];
	String[] inputB = scan.nextLine().split(" ");
	for (int i = 0; i < q; i++) {
	    m[i] = Integer.parseInt(inputB[i]);
	}
	for (int i = 0; i < q; i++) {
	    if (solve(0, m[i])) {
		System.out.println("yes");
	    } else {
		System.out.println("no");
	    }
	}
    }
    static boolean solve (int i, int m) {
	if (m == 0) {
	    return true;
	}
	if (i >= n) {
	    return false;
	}
	return solve(i+1, m) || solve(i+1, m-a[i]);
    }
}