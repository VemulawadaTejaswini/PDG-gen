import java.util.Scanner;

public class Main {
	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		String str = "";
		if(b <= a) {
			for(int i = 0; i < a; i++) {
				str = str + String.valueOf(a);
			}
		} else {
			for(int i = 0; i < b; i++) {
				str = str + String.valueOf(b);
			}
		}
		System.out.println(str);
	}
}
