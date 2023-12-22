import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner IN = new Scanner(System.in);
		int temp = IN.nextLine();
		if(temp < 30)
			System.out.println("No");
		else
			System.out.println("Yes");
	}
}