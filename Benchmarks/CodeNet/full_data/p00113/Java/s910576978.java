import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			final int p = sc.nextInt();
			final int q = sc.nextInt();

			int[] mod = new int[q];
			Arrays.fill(mod, Integer.MAX_VALUE);

			int div = p;
			int count = 0;
			int start = 0;
			int end = 0;
			boolean ok = false;
			
			while (true) {
				if(div % q == 0){
					ok = true;
					end = count;
					break;
				}else if (mod[div % q] != Integer.MAX_VALUE) {
					end = count;
					start = mod[div % q];
					break;
				} else {
					mod[div % q] = count + 1;
					div = (div % q) * 10;
					count++;
				}
			}

			div = (p % q) * 10;
			for (int i = 1; i <= end; i++) {
				System.out.print((int) (div / q));
				div = (div % q) * 10;
			}
			System.out.println();
			if(!ok){
				for (int i = 1; i <= end; i++) {
					System.out.print(i < start ? " " : "^");
				}
				System.out.println();
			}
		}
	}
}