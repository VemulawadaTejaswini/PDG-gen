import java.util.Scanner;
import java.util.Comparator;
import java.util.Arrays;
import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int sum = 0;
		for (int i = 0; i < S.length(); i++) {
			if(S.charAt(i) == 'x') {
				sum++;
				if(sum >= 8) {
					break;
				}
			}
		}
		if(sum>=8) {
			System.out.println("NO");
		}
		else {
			System.out.println("YES");
		}
		
		

	}
}	

