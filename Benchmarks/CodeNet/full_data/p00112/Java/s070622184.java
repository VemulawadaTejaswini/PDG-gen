import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			int n;
			while (0 != (n = Integer.parseInt(in.readLine()))) {
				int[] a = new int[n];
				for (int i = 0; i < n; i++) {
					a[i] = Integer.parseInt(in.readLine());
				}
				Arrays.sort(a);
				int time = 0;
				int sum = 0;
				for (int i = 0; i < n; i++) {
					time += sum;
					sum += a[i];
				}
				System.out.println(time);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}