import java.util.*;
import java.io.*;

public class A {
	public static void main(String[] args) throws IOException {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		
		int a = sc.nextInt(), b = sc.nextInt();
		System.out.println(Math.max(0, a - 2 * b));
	}
}
