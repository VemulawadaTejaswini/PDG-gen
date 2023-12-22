import java.util.Scanner;

/**
 * 172 Beginner
 * A:Calc
 */
public class Main {
	public static void main(String[] args){
		// input
		java.util.Scanner inData = new Scanner(System.in);

		int a = inData.nextInt();

		System.out.println(a + a*a + a*a*a);

		inData.close();

	}

}
