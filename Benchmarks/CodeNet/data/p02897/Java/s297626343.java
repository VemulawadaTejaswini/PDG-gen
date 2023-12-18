import java.util.*;

public class Main {

	public static void main (String[] args){

		Scanner sc = new Scanner(System.in);
		double number= sc.nextDouble();
		double remainder= number/2;
		if(!(remainder%2==0))
			remainder=remainder+.5;
		double probability= remainder/number;
		System.out.println(probability);

	}

}