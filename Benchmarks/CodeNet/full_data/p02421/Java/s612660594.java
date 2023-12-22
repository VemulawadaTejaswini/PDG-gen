import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k1 = 0;
		int k2 = 0;
		for(int i = 0; i < n; i++) {
			String s1 = scan.next();
			String s2 = scan.next();
			if(s1.compareTo(s2) == 0) {
				k1 ++;
				k2 ++;
			}else if(s1.compareTo(s2) >= 1) {
				k1 += 3;
			}else {
				k2 += 3;
			}
		}
		scan.close();
		System.out.println(k1 + " " + k2);
	}
}
