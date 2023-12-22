import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int input_a = scan.nextInt();
		int input_b = scan.nextInt();
		
		if(input_a > input_b){
			System.out.println("a > b");
		}else if(input_a < input_b){
			System.out.println("a < b");
		}else{
			System.out.println("a == b");
		}
		
	}

}