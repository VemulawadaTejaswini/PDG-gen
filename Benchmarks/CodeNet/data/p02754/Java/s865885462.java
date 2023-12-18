
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] as = br.readLine().split(" ");
		long n = Long.parseLong(as[0]);
		long a = Long.parseLong(as[2]);
		long b = Long.parseLong(as[1]);
		long sum = 0;
		long bSum = 0;
		while(sum <= n) {
			if(sum + b >= n) {
				bSum += n - sum;
				break;
			}
			bSum += b;
			sum += b;sum += a;
			if(sum >= n) {
				break;
			}
			
		}
		System.out.println(bSum);
	}

}
