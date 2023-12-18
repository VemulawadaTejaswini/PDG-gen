
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		String s = sc.next();
		while(s.length() > 1) {
			String tmp = "";
			for(int i = 0; i < s.length() - 1; i++) {
				int v = Math.abs(Integer.valueOf(s.substring(i, i + 1)) - Integer.valueOf(s.substring(i + 1, i + 2)));
				if(v != 0) {
					tmp += v;
				}
			}
			s = tmp;
		}
		if(s.length() == 0) {
			System.out.println(0);
		} else {
			System.out.println(s);
		}
	}
}
