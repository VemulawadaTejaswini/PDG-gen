import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while(true){

			int a = Integer.parseInt(scan.next());//???
			int b = Integer.parseInt(scan.next());//?¨?

			if(a == 0 && b == 0){
				break;
			}else if(3 <= b && a <= 100){

				for(int num1 = 1 ; num1 <= b  ; num1++){
					System.out.print("#");
				}
				System.out.println();
				for(int num2 = 1 ; num2 <= a-2 ; num2++){
					System.out.print("#");
					for(int num1 = 1 ; num1 <= b-2  ; num1++){
						System.out.print(".");
					}System.out.println("#");
				}
				for(int num1 = 1 ; num1 <= b  ; num1++){
					System.out.print("#");
				}
				System.out.println("");
			}
		}
		scan.close();
	}
}