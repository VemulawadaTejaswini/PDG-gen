import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		if(s.charAt(0) == 'A') {
			int cnt = 0;
			int index = 0;
			for(int j = 2; j < s.length() - 1; j++) {
				if(s.charAt(j) == 'C') {
					cnt++;
					index = j;
				}
			}
			if(cnt == 1) {
				boolean ok = true;
				for(int i = 1; i < s.length(); i++) {
					if(i == index) continue;
					if(s.charAt(i) == 'A' || s.charAt(i) == 'B' || s.charAt(i) == 'C') ok = false;
				}
				if(ok) {
					System.out.println("AC");
					return;
				}
			}
		}
		System.out.println("WA");
	}
}
