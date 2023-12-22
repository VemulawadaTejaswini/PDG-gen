import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNextInt()) {
			final int n = sc.nextInt();
			
			int count = 0;
			
			final int lim = Math.min(1000, n);
			for (int a = 0; a <= lim; a++) {
				
				final int lim_b = lim - a;
				for (int b = 0; b <= lim_b; b++) {
					
					final int lim_c = lim - a - b;
					for (int c = 0; c <= lim_c; c++) {
						final int diff = n - a - b - c;
						
						if(diff < 0){
							break;
						}else if(diff > 1000){
							continue;
						}
						
						
						count++;
					}
				}
			}
			
			System.out.println(count);
		}
	}

}