import java.util.HashMap;
import java.util.Scanner;

public class Main {
	
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		long pr = 1;
		long num = (long)1e18;
		while(n--!=0) {
			long c = s.nextLong();
			if(pr>=0 && pr<=num) {
				pr*=c;
			}
			else {
				pr = -1;
			}
		}
		if(!(pr>=0 && pr<=num)) {
			pr=-1;
		}
		System.out.println(pr);
	}

}
