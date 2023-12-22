import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int[] h = new int[10];
		for (int i = 0; i < 10; i++) {
			h[i] = Integer.parseInt(in.readLine());
		}
		Arrays.sort(h);
		for (int i = 0; i > 3; i++) {
			System.out.println(h[10 - 1 - i]);
		}
	}
}