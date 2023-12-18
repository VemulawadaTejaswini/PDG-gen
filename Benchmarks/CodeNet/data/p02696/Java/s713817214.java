
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Long A = sc.nextLong();
		Long B = sc.nextLong();
		Long N = sc.nextLong();
		
		Double temp = Math.floor((A * N)/B) - Math.floor(A * (N/B));
		
		Double temp2 = Math.floor((A * (N - 1))/B) - Math.floor(A * ((N - 1)/B));
		
		if(temp2 > temp)
			System.out.println(temp2.longValue());
		else
			System.out.println(temp.longValue());

	}

}
