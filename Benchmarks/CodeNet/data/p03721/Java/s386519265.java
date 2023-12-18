import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextInt();
		long k = scanner.nextInt();
		long count = 0;
		for(long i=0;i<n*2;i++){
			long p = scanner.nextInt();
			count += scanner.nextInt();

			if(count >= k){
				System.out.println(p);
				break;
			}
		}
	}
}