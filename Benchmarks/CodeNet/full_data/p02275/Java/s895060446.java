import java.util.Scanner;
public class Main {
    public static void main (String[] args) throws IOException{
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	int[] a = new int[n];
	int[] b = new int[n];
	int max = 0;
	for (int i = 0; i < n; i++) {
	    a[i] = scan.nextInt();
	    max = Math.max(max, a[i]);
	}
	CountingSort(a, b, max);
	StringBuilder sb = new StringBuilder();
	for (int i = 0; i < n; i++) {
	    sb.append(b[i]).append(' ');
	}
	System.out.println(sb.toString().trim());
    }
    static void CountingSort (int[] a, int[] b, int k) {
	int n = a.length;
	int[] c = new int[k+1];
	for (int j = 0; j < n; j++) {
	    c[a[j]]++;
	}
	for (int i = 1; i <= k; i++) {
	    c[i] = c[i] +c[i-1];
	}
	for (int j = n - 1; j >= 0; j--) {
	    b[c[a[j]]-1] = a[j];
	    c[a[j]]--;
	}
    }
}