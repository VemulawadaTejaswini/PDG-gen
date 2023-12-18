import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
		    arr[i] = sc.nextInt();
		}
		int[] lefts = new int[n];
		int[] rights = new int[n];
		lefts[1] = arr[0];
		rights[n - 2] = arr[n - 1];
		for (int i = 2; i < n; i++) {
		    lefts[i] = gcd(lefts[i - 1], arr[i - 1]);
		    rights[n - i - 1] = gcd(rights[n - i], arr[n - i]);
		}
		int max = 1;
		for (int i = 1; i < n - 1; i++) {
		    max = Math.max(max, gcd(lefts[i], rights[i]));
		}
		max = Math.max(max, lefts[n - 1]);
		max = Math.max(max, rights[0]);
		System.out.println(max);
   }
   
   static int gcd(int x, int y) {
       if (x % y == 0) {
           return y;
       } else {
           return gcd(y, x % y);
       }
   }
}
