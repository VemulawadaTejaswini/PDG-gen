import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = Integer.parseInt(scan.nextLine());
	int[] a = new int[n];
	String[] inputArray = scan.nextLine().split(" ");
	for (int i = 0; i < n; i++) {
	    a[i] = Integer.parseInt(inputArray[i]);
	}
	System.out.println(cntNum(a));
    }

    public static int cntNum (int[] a) {
	int n = a.length, cnt = 0;
	for (int i = 0; i < n; i++) {
	    for (int j = i+1; j < n; j++) {
		if (a[i] > a[j]) {
		    cnt++;
		}
	    }
	}
	return cnt;
    }
}