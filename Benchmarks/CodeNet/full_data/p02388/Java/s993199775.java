import java.util.Scanner;

class Contest {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int x = stdIn.nextInt();
		
		x = x * x * x;
		
		System.out.println(x);
		stdIn.close();
	}

}