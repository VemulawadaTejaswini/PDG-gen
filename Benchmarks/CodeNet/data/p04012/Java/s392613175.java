import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] ary = sc.next().toCharArray();
		boolean beau = true;
		for (char c1 : ary) {
			int count = 0;
			for (char c2 : ary) {
				if(c1 == c2) {
					count++;
				}
			}
			if(count%2 != 0) {
				beau = false;
				break;
			}
		}
		if(beau) System.out.println("Yes");
		else System.out.println("No");
	}
}