import java.util.*;

public class Main {
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			int N = sc.nextInt();
			double tax = 1.08;
			
			double X = N / tax;
			double Y = Math.round(X);
			
			if(Y * 1.08 == N) {
				System.out.println(Math.round(X));
			}else {
				System.out.println(":(" );
			}
}
}