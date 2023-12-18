import java.util.Scanner;

class at{
	public static void main(String args[]){
		Scanner stdIn = new Scanner(System.in);
		
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		
		if (a < 9 && b < 9){
			System.out.println("Yay!");
		}
		else System.out.println(":(");
	}
}