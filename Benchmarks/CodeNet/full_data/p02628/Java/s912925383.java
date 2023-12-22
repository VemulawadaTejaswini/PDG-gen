import java.util.*;
import java.io.*;
import java.lang.*;

public class ABC171B {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); int n = sc.nextInt();
		int[] price = new int[t];
		while (t-- > 0) {
			price[t] = sc.nextInt(); //receives input in reverse
		}

		Arrays.sort(price);
		int sum = 0;
		for (int i = 0; i<n; i++) {
			sum+=price[i];
		}

		System.out.println(sum);
	}
}
