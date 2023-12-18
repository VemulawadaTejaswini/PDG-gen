import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		String winner = "";
		if(a == 1) {
			if(b == 1) {
				winner = "Draw";
			} else {
				winner = "Alice";
			}
		} else if(b == 1) {
			winner = "Bob";
		} else {
			if(a == b) {
				winner = "Draw";
			} else if(a > b){
				winner = "Alice";
			} else {
				winner = "Bob";
			}
		}
		System.out.println(winner);
	}
}