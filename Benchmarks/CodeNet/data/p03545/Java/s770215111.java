
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		int[] x = new int[4];
		for(int i = 0 ; i < 4 ; i++) {
			x[i] = a.charAt(i) - '0';
		}
		for(int i = 0 ; i < 8 ; i++) {
			int sum = x[0];
			String s = "" + (char)(x[0] + '0');
			for(int j = 0 ; j < 3 ; j++) {
				if((i & (1 << j)) == 0) {
					sum += x[j + 1];
					s += '+';
					s += "" + (char)(x[j + 1] + '0');
				} else {
					sum -= x[j + 1];
					s += '-';
					s += "" + (char)(x[j + 1] + '0');
				}
			}
			if(sum == 7) {
				s += '=';
				s += '7';
				System.out.println(s);
				return;
			}
		}
	}
}