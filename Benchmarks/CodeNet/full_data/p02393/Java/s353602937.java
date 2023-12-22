import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int input[] = new int[3];
		
		input[0] = scan.nextInt();
		input[1] = scan.nextInt();
		input[2] = scan.nextInt();
		
		int tmp;
		if(input[0] > input[1]){
			tmp = input[0];
			input[0] = input[1];
			input[1] = tmp;
		}
		if(input[1] > input[2]){
			tmp = input[1];
			input[1] = input[2];
			input[2] = tmp;
		}
		if(input[0] > input[1]){
			tmp = input[1];
			input[1] = input[0];
			input[0] = tmp;
		}
		
		System.out.println(input[0] + " " + input[1] + " " + input[2]);
	}

}