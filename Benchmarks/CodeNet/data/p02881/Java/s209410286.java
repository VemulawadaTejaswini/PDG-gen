import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main mainObj = new Main();
		mainObj.exec();
	}
	
	public void exec() {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		sc.close();
		
		long minDist = n;
		
		for(long i = 1L; i*i <= n; i++) {
			if(n % i == 0) {
				minDist = Math.min(minDist, i + n/i -2);
			}
		}
		
		System.out.println(minDist);
	}
}
