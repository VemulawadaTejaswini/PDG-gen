import java.util.*;
public class Main {
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		//input integer
		long A = sc.nextLong();
		double B = sc.nextDouble();
		long result = (long) Math.floor(A*B);
		System.out.println(result);
		sc.close();
	}

}