import java.io.*;
import java.util.*;

class Main {

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		if (a == b) {
			for (int i = 0; i < b; i++) {
				sb.append(b);
			}
		} else if (a > b) {
			for (int i = 0; i < a; i++) {
				sb.append(b);
			}
		} else {
			for (int i = 0; i < b; i++) {
				sb.append(a);
			}
		}
		System.out.println(sb.toString());
	}
}
