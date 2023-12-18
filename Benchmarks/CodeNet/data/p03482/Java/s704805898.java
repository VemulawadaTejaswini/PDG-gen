import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		char[] arr = in.readLine().toCharArray();
		int best = arr.length;
		char l = '-';
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != l && i != 0) {
				int o = arr.length - i;
				int m = i > o ? i : o;
				if(m < best) best = m;
			}
			l = arr[i];
		}
		System.out.println(best);
	}
}