import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = Integer.parseInt(scan.nextLine());
	int[] a = new int[10];
	String[] input;
	for (int i = 0; i < n; i++) {
	    input = scan.nextLine().split(" ");
	    for (int j = 0; j < 10; j++) {
		a[j] = Integer.parseInt(input[j]);
	    }
	    if (devideBall(a)) {
		System.out.println("YES");
	    } else {
		System.out.println("NO");
	    }
	}
    }
    static boolean devideBall (int[] a){
	int[] b = new int[11];
	int[] c = new int[11];
	int posB = 1, posC = 1, n, preB, preC;
	for (int i = 0; i < a.length; i++) {
	    n = a[i];
	    preB = b[posB - 1];
	    preC = c[posC - 1];
	    if (n > preB && n > preC) {
		if (preB > preC) {
		    b[posB++] = n;
		} else {
		    c[posC++] = n;
		}
	    } else if (n > preB && n < preC) {
		b[posB++] = n;
	    } else if (n > preC && n < preB) {
		c[posC++] = n;
	    } else {
		return false;
	    }
	}
	return true;
    }
}