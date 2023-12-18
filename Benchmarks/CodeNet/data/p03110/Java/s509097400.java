import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N  = Integer.parseInt(sc.next());
		double sum = 0;

		for (int i=0; i<N; i++){
			double x = Double.parseDouble(sc.next());
			String u = sc.next();

			sum += u.equals("JPY") ? x : x * (double)380000 ;
		}
		System.out.println(sum);
	}
}