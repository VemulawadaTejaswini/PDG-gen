import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String a = s.nextLine();
		char[] ar = a.toCharArray();
		loop: for (int i = 0;i < ar.length();i++) {
			int y = 0;
			for (int m = 0;m < ar.length();m++) {
				if(ar[n].equals(ar[m])) {
					y += 1;
				}
				if(m.equals(ar[ar.length()])) {
					if(y % 2 == 1) {
						System.out.println("No");
						break loop;
					}
				}
			}
		}
		System.out.println("Yes");
	}
}