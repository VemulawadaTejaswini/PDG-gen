import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String I = sc.nextLine();
		int max = 0;
		int count = 0;
		for(int i=0; i<I.length(); i++) {
			if(I.charAt(i) == 'A' || I.charAt(i) == 'C' || I.charAt(i) == 'G' || I.charAt(i) == 'T') {
				count++;
			} else {

				max = Math.max(max, count);
				count = 0;
			}
		}
		max = Math.max(max, count);
		System.out.println(max);
	}
}
