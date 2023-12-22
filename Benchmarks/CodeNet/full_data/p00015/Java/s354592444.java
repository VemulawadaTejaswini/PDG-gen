import java.util.Scanner;

public class Main {
	private String a, b;
	private StringBuffer str;

	public static void main(String[] args) {
		new Main().run();
	}
	
	private void run() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		while (n-- > 0) {
			a = scan.next();
			b = scan.next();
			
			 int aDigit = a.length();
			 int bDigit = b.length();
			 
			 if (aDigit > 80 || bDigit > 80) {
				 System.out.println("overflow");
				 continue;
			 }
			 
			 int up = 0;
			 str = new StringBuffer();
			 for (int i = aDigit-1, j = bDigit-1; i >= 0 || j >= 0; i--, j--) {
				 if (i >= 0 && j >= 0) {
					 int p = Integer.parseInt(a.substring(i, i + 1)) + Integer.parseInt(b.substring(j, j + 1)) + up;
					 int q = p % 10;
					 up = p / 10;
					 str.insert(0, q);
				 }else if (i < 0){
					 int p = Integer.parseInt(b.substring(j, j + 1)) + up;
					 int q = p % 10;
					 up = p / 10;
					 str.insert(0, q);
				 }else {
					 int p = Integer.parseInt(a.substring(i, i + 1)) + up;
					 int q = p % 10;
					 up = p / 10;
					 str.insert(0, q);
				 }
			 }
			 if (up > 0) {
				 str.insert(0, up);
				 if (aDigit == 80 || bDigit == 80) {
					 System.out.println("overflow");
					 continue;
				 }
			 }
			 System.out.println(str);
		}
	}
	
	private void debug() {
		System.out.println();
	}

}