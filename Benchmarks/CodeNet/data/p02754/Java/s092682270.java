import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		long total = scanner.nextLong();
		long a = scanner.nextLong();
		long b = scanner.nextLong();
		long aCount = 0;
		long plusCount =0;
		do {
			for(long j = 0; j<a; j++) {
				plusCount++;
				if(plusCount <= total) {
					aCount++;
				}
			}
			for(long k =0; k<b; k++) {
				plusCount++;
			}
			
		} while(plusCount<=total);
		
		
		System.out.println(aCount);

	}	
	
}