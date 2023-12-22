import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		while(true){

			Scanner scan = new Scanner(System.in);

			int a = Integer.parseInt(scan.next());
			int b = Integer.parseInt(scan.next());

			for(int num1 = 1 ; num1 <= a  ; num1++){
				System.out.print("#");
			}
			System.out.println();
			for(int num2 = 1 ; num2 <= b-2 ; num2++){
				System.out.print("#");
				for(int num1 = 1 ; num1 <= a-2  ; num1++){
					System.out.print(".");
				}System.out.println("#");
			}
			for(int num1 = 1 ; num1 <= a  ; num1++){
				System.out.print("#");
			}
		}

	}

}