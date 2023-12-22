import java.math.BigDecimal;
import java.util.Scanner;

class Main{


	public static void main(String[] a){

		Scanner sc = new Scanner(System.in);


		int gankin = 100000;

		int n = sc.nextInt();

		for(int i = 0; i < n; i++) {

			double rishi = gankin * 0.05;

			double newGankin = gankin + rishi;

			BigDecimal bd = new BigDecimal(newGankin);
			bd = bd.setScale(-3, BigDecimal.ROUND_UP);

			gankin = (int)bd.doubleValue();
		}

		System.out.println(gankin);

		sc.close();
	}


}