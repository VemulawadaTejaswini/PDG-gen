import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		String s = sc.nextLine();
		int slen = s.length();
		
		if (slen < 4) {
			System.out.println("0");
			return;
		}
		
		long count = 0;
		for (int i=0; i<slen-4; i++) {
			for (int j=i+4; j<=slen; j++) {
				var sub = s.substring(i, j);
				var subp = Long.parseLong(sub);
				if (subp % 2019 == 0) {
					count++;
				}
			}
		}
		
		System.out.println(count);
	}
}
