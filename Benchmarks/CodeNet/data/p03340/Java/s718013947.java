import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		int n = 0;
		int[] a = null;
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			n = Integer.parseInt(br.readLine());
			a = new int[n];
			
			int i = 0;
			for (String str : br.readLine().split(" ")) {
				a[i++] = Integer.parseInt(str);
			}
		} catch (IOException e) {
			return;
		}
		
		int count = n;
		
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				int num1 = a[i];
				int num2 = a[i];
				for (int k = i + 1; k <= j; k++) {
					num1 ^= a[k];
					num2 += a[k];
				}
				
				if (num1 == num2) count++;
			}
		}
		
		System.out.println(count);
	}
}
