import java.util.*;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}
	
	private void run() {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			int sum = 0;
			for (int i = 1; i <= n; i++) {
				if (isPrime(i)) {
					sum++;
				}
			}
			System.out.println(sum);
		}
	}
	
	boolean isPrime(int n){
	    int i;
	 
	    if(n < 2)
	        return false;
	    else if(n == 2)
	        return true;
	 
	    if(n % 2 == 0)
	        return false;
	 
	    for(i = 3; i * i <= n; i += 2)
	         if(n % i == 0)
	            return false;
	    return true;
	}

}