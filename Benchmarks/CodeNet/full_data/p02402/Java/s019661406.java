import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		long[] lArray = convertLong(br.readLine().split(" "));
		long min = 0, max = 0, sum = 0;
		for (int i = 0; i < n; i++) {
			if (lArray[i] < min | i == 0) {
				min = lArray[i];
			}
			if (lArray[i] > max | i == 0) {
				max = lArray[i];
			}
			sum = sum + lArray[i];
		}
		System.out.println(min + " " + max + " " + sum);
	}

	private static long[] convertLong(String[] strArray) {
		long[] longArray = new long[strArray.length];
		for (int i = 0; i < strArray.length; i++) {
			longArray[i] = Long.parseLong(strArray[i]);
		}
		return longArray;
	}
}