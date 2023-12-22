import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int input_a = scan.nextInt();
		int input_b = scan.nextInt();
		int input_c = scan.nextInt();
		
		if(input_a < input_b && input_b < input_c){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		
	}

}