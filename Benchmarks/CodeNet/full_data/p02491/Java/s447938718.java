import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) throws java.io.IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] ia;

		ia = in.readLine().split(" ");
		int[] ab = new int[2];
		ab[0] = Integer.parseInt(ia[0]);
		ab[1] = Integer.parseInt(ia[1]);
		System.out.printf("%d %d %.5f%n",ab[0]/ab[1],ab[0]%ab[1],((double)ab[0])/((double)ab[1]));
	}
}