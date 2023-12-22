
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			double i = sc.nextDouble();
			double f1, f2;
			double p = Math.PI;
			f1 = i * i * p;
			f2 = 2 * p * i;
			System.out.printf("%.6f %.6f\n", f1, f2);
	  }
}

