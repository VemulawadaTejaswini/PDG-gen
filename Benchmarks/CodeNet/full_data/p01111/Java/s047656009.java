
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {

		for (;;) {
			long n = sc.nextInt();
			if (n == 0) {
				break;
			}
			
			long left = n;
			int size = 1;

			for(int i = 1; ;i++){
				
				if(i % 2 == 0){
					if((n - i/2)/i - i/2 +1<= 0){
						break;
					}
					if((n - i/2) % i == 0){
						left = (n - i/2)/i - i/2+1;
						size = i;
					}
				}else{
					if( n/i - i/2 <= 0){
						break;
					}
					if(n % i == 0){
						left = n/i - i/2;
						size = i;
					}					
				}
			}

			System.out.println(left+" "+size);
		}

	}
}

