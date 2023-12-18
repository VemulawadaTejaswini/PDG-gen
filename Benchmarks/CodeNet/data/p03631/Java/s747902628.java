import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int input = sc.nextInt();
		if(input/100 == input%10)
		{
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
		
		// TODO Auto-generated method stub

	}

}
