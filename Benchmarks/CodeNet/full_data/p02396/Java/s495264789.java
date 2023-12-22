import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int i = 0;
		while(true) {
			i ++;
			Scanner scan = new Scanner(System.in);
			int a = Integer.parseInt(scan.next());
			scan.close();
			if(a == 0) {
				break;
			}
			System.out.println("Case " + i + ": " + a);
		}
	}
}
