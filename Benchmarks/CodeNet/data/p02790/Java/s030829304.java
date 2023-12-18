import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt(), b = s.nextInt();
		if (a<b) {
			String r = "";
			for(int i=0;i<b;i++) {
				r += a;
			}
			System.out.println(r);
		}else {
			String r = "";
			for(int i=0;i<a;i++) {
				r += b;
			}
			System.out.println(r);
		}

	}
}
