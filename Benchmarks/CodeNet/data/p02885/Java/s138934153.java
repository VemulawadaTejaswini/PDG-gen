import java.util.*;

public class Main {

	public static void main (String[] args){

		Scanner sc = new Scanner(System.in);
		int number= sc.nextInt();
		int curtain= sc.nextInt();
		curtain= 2 *curtain;

		if (curtain> number)
			System.out.println("0");
		else
			System.out.println(number-curtain);


	}

}