import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static PrintStream o = System.out;
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] get = new String[n];
		int res = 0;
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			String one = sc.nextLine();
			boolean find = false;
			for (int j = 0; j < res; j++) {
				if (one.equals(get[j])) {
					find = true;
					break;
				}
			}
			if (!find) {
				get[res] = one;
				res++;
			}
		}
		o.println(res);
	}
}