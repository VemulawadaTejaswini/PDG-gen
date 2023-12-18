import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length();
		boolean[] b = new boolean[n];
		Arrays.fill(b, false);
		for(int i = 0; i < n; i++) {
			if(s.charAt(i) == 'B')b[i] = true;
		}
		int tmp;
		int count = 0;
		while(true) {
			tmp = 0;
			for(int i = 0; i < n-1; i++) {
				if(b[i] && !b[i+1]) {
					b[i] = false;
					b[i+1] = true;
					count++;
					tmp++;
				}
			}
			if(tmp == 0)break;
		}
		System.out.println(count);
	}
}