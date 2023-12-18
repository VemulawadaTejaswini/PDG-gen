
import java.io.*;
import java.text.*;
import java.util.*;
 
public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int N = sc.nextInt();
		int M = sc.nextInt();
		int B = sc.nextInt();
		String msg = "No";
		if (N == B && M == B) {
			msg = "Yes";
		}
		System.out.println(msg);
	}
}