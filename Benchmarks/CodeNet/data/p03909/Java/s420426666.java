import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		for (int i=0;i<h;i++) {
			for (int j=0;j<w;j++) {
				String temp = sc.next();
				if ("snuke".equals(temp)) {
					System.out.print((char)i+'A');
					System.out.print(j+1);
					break;
				}
			}
		}
	}
}