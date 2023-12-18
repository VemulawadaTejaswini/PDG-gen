
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		String[] list = new String[n];
		for (int i = 0; i < list.length; i++) {
			list[i] = scan.next();
		}
		
		char previous = list[0].charAt(list[0].length() - 1);
		
		String ans = "Yes";
		for (int i = 1; i < list.length; i++) {
			if (previous != list[i].charAt(0)) {
				ans = "No";
				break;
			}
			previous = list[i].charAt(list[i].length() -1);
		}
		System.out.println(ans);
	}
}