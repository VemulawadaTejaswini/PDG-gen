import java.util.*;
import java.lang.*;
import java.io.*;
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(), B = sc.nextInt();
		int x = A + B;
		int N = sc.nextInt();
		if (N == 1) {
			System.out.println("Hello World");
		} else {
			System.out.println(x);
		}
	}
}