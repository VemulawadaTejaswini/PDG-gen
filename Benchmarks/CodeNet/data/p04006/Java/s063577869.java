import java.util.*;
import java.math.*;
import java.lang.String;
import java.lang.System;
import java.lang.reflect.Array;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int x = sc.nextInt();
		long[] arr = new long[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		long answer = arr[0];
		long y = x + arr[0];
		for (int i = arr.length - 1; i > 0; i--) {
			if (arr[i] < y) {
				answer += arr[i];
			} else {
				answer += y;
			}
		}
		System.out.println(answer);
		
		
	}
}
