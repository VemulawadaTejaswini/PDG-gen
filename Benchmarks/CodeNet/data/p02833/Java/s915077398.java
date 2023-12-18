import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		if (n%2 ==0) {
			long count = 0 ;
			n = n - (n%10);
			while(n >= 2) {
				count += getNumOfTen(n);
				n -=10;
			}
			System.out.println(count);

		}else {
			System.out.println(0);
		}
	}
	public static int getNumOfTen(long n) {
		if(n %10 == 0) {
			return getNumOfTen(n/10)+1;
		}else {
			return 0;
		}
	}
	
}
