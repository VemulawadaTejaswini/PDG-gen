import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int input1 = input.nextInt();
		int input2 = input.nextInt();
	 
		if ((input1 + input2) % 2 == 0)
			System.out.print((input1 + input2) / 2);
		else
			System.out.print("IMPOSSIBLE");
		
		
		input.close();

	}

}