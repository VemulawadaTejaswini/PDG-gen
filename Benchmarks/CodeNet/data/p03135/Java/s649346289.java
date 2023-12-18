import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double T=sc.nextDouble();
		double X=sc.nextDouble();

		System.out.print(String.format("%.10f",T/X));

		sc.close();
	}

}

