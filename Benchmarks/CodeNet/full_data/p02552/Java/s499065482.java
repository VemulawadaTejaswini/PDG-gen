import java.util.Scanner;

public class Main {


		public static void main(String[] args) {

			Scanner scan = new Scanner(System.in);
			int N = scan.nextInt();


			if(N ==0 ) {
				System.out.println(1);
			}
			else {
				System.out.println(0);
			}
			scan.close();
		}

}
