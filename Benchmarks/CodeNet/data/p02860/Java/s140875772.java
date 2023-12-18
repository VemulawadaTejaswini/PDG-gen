import java.io.*;
import java.math.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		String S = input.next();
		String ans = "No";
		if (N%2==0) {
			int mid = N/2;
			String left = S.substring(0,mid);
			String right = S.substring(mid,N);
			if (left.equals(right)) ans="Yes";
		}
		System.out.println(ans);
	}
}