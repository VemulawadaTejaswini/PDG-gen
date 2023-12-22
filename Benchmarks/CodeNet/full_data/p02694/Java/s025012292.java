import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		long x = stdIn.nextLong();
		long price = 100;
		long cnt = 0;
		while(price < x) {
			cnt++;
			price*=1.01;
			
		}
		System.out.println(cnt);
		
	}

}
