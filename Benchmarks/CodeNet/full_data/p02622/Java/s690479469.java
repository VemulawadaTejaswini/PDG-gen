import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		int n = s.length();
		int sum = 0;
		for(int i = 0 ; i < n ; i++) {
			if(s.charAt(i) != t.charAt(i))
					sum++;
		}

		System.out.println(sum);

	}
}

