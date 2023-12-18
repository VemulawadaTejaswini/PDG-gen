import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 int N = scan.nextInt();
		 int A = scan.nextInt();
		 int B = scan.nextInt();
		 
		 int sum = 0;
		 for (int i = 1; i <= N; i++) {
			 if ( (i / 10) + (i % 10) >= A && (i / 10) + (i % 10) <= B) {
				 sum += i;
			 }
		 }
		 
		 System.out.println(sum);
		 
		 scan.close();

	}

}
