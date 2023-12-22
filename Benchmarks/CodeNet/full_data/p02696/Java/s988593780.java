
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Long A = sc.nextLong();
		Long B = sc.nextLong();
		Long N = sc.nextLong();
		
		Double temp1 = Math.floor((A * N)/B) - A * Math.floor(N/B);
		
		Double temp2 = Math.floor((A * (N - 1))/B) - A * Math.floor((N - 1)/B);
		
		if(temp1 <= N && temp1 > temp2)
			System.out.println(temp1.longValue());
		else 
			System.out.println(temp2.longValue());

	}

}
