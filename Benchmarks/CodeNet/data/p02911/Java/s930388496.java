import java.util.*;

public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int k = sc.nextInt();
	int q = sc.nextInt();
	int[] score = new int[n];
	for (int i=0; i<q; i++) {
	    score[sc.nextInt()-1]++;
	}
	for (int i=0; i<n; i++) {
	    if (k - (q - score[i]) <= 0)
		System.out.println("No");
	    else {
		System.out.println("Yes");
	    }
	}
    }
}
