
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int min = scan.nextInt();
		int max = scan.nextInt();
		int n = scan.nextInt();
		
		if ((max - min) >= n) {
			for (int i = 0; i < n; i++) {
				System.out.println(min + i);
			}
			for (int i = 0; i < n; i++) {
				System.out.println(max - n + 1 + i);
			}
		} else {
			for (int i = min; i <= max; i++) {
				System.out.println(i);
			}
		}
		
	}
}