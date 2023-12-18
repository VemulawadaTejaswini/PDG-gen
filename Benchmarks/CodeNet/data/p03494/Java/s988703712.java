import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		int n;

		do {
			System.out.print("N: ");
			n = kb.nextInt();
		} while (n > 200);

		/* Aを入力 */
		int[] numA = new int[n];
		System.out.print("A: ");
		for (int i = 0; i < n; i++) {
			numA[i] = kb.nextInt();
			System.out.println("["+numA[i]+"]");
		}
		
		int j=0;
		while (j<n) {
			boolean exist_odd = false;
			for (int i = 0; i < n; ++i) {
				if (numA[i] % 2 != 0 || numA[i]/2 == 0) 
					exist_odd = true;
				
				if(exist_odd|| numA[i]/2 == 0) break;
				
				for (int k = 0; k < n; ++k) {
						numA[k] /= 2;
						System.out.println("["+numA[k]+"]");
					 
				} ++j;
			}
			
			kb.close();
			System.out.println("答え:" + j);
		} 

	}

}
