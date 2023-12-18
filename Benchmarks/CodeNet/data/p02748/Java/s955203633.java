import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int m = sc.nextInt();
		int[] arrA = new int[a];
		int minA = Integer.MAX_VALUE;
		for (int i = 0; i < a; i++) {
		    arrA[i] = sc.nextInt();
		    minA = Math.min(minA, arrA[i]);
		}
		int[] arrB = new int[b];
		int minB = Integer.MAX_VALUE;
		for (int i = 0; i < b; i++) {
		    arrB[i] = sc.nextInt();
		    minB = Math.min(minB, arrB[i]);
		}
		int min = minA + minB;
		for (int i = 0; i < m; i++) {
		    min = Math.min(min, arrA[sc.nextInt() - 1] + arrB[sc.nextInt() - 1] - sc.nextInt());
		}
	    System.out.println(min);
	}
}
