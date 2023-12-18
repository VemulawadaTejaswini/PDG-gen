import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n];
		for(int i = 0 ; i < n ; i++) s[i] = sc.next();
		int cnt = 0;
		for(int i = 0 ; i < n ; i++) {
			if(s[i].equals("Y")) cnt++;
		}
		if(cnt >= 1) {
			System.out.println("Four");
		} else {
			System.out.println("Three");
		}
	}
}
