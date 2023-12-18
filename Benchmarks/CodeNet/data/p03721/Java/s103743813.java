import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		long[] number = new long[100010];
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			number[a] += b;
		}
		long ans = 0;
		long num = 0;
		for(int i = 1; i < 100001; i++) {
			num += number[i];
			if (num >= k) {
				ans = i;
				break;
			}
		}
		
		System.out.println(ans);

	}
}
