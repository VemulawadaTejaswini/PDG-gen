import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String B = sc.nextLine();
		int max = 0;
		int count = 0;
		for(int i=0; i<B.length(); i++) {
			if(B.charAt(i) == 'A' || B.charAt(i) == 'C' || B.charAt(i) == 'G' || B.charAt(i) == 'T') {
				count++;
			} else {
				max = Math.max(max, count);
				count = 0;
			}
			max = Math.max(max, count);
		}
		System.out.println(max);
	}

}
