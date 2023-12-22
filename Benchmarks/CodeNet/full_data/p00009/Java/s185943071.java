import java.util.Scanner;
public class Main {
	boolean isPrime(int num) {
		if(num < 2) return(false);
		for(int r = 2; r * r <= num; r++) {
			if(num % r == 0) return(false);
		}
		return(true);
	}
	
	void doIt() {
		Scanner stdIn = new Scanner(System.in);
		
		while(stdIn.hasNext()) {
			int num = stdIn.nextInt();
			int ans = (num >= 2) ? 1 : 0;
			for(int r = 3; r <= num; r += 2) {
				if(isPrime(r)) ans++; 
			}
			System.out.println(ans);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().doIt();
	}
}