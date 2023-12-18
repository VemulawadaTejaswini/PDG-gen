
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		String ans = "yes";
		char[] list = s.toCharArray();
		outside: for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list.length; j++) {
				if (i == j) {
					continue;
				}
				
				if (list[i] == list[j]) {
					ans = "no";
					break outside;
				}
			}
		}
		
		System.out.println(ans);
	}
}