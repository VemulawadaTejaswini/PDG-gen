import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 
		 int N = scan.nextInt();
		 int L = scan.nextInt();
		 
		 int apple_pie_taste = 0; 
		 for (int i = 1; i <= N; i++ ) {
			 apple_pie_taste += L + i - 1;
		 }
		 
		 if (L > 0) {
			 apple_pie_taste -= L;
		 } else if (L < 0 && N + L - 1 >= 0) {
			 apple_pie_taste -= 0;
		 } else {
			 apple_pie_taste -= N + L - 1;
		 }
		 
		 System.out.println(apple_pie_taste);
		 
		 scan.close();
		 
	}

}
