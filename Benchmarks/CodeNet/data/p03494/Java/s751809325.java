import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		int[] arr = new int[n];
		int[] cnt = new int[n];
		for(int i = 0; i < n; ++i) {
			arr[i] = in.nextInt();
			while(arr[i] % 2 == 0) {
				++cnt[i];
				arr[i] /= 2;
			}
		}


		int ans = cnt[0];
		for(int i = 0; i< n; ++i)
			ans = Math.min(ans, cnt[i]);

		System.out.println(ans);
	}
}
