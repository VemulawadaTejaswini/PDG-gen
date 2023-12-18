
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		long m = sc.nextLong();
		
		if(n*2 >= m) {
			System.out.println(m/2);
		}
		else {
			long result = n;
			m -= 2*n;
			
			result += m/4;
			
			System.out.println(result);
		}
	}

}
