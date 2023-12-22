import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt(), b = scan.nextInt(), c = scan.nextInt();
		long[] amin = new long[a]; long[] bmin = new long[b];
		int count = 0, aco = 0, bco = 0;
		long tempmin  = 0;
		boolean at = false, bt = false;
		long sum = 0;


		for(int i = 0; i < a; i++) {
			amin[i] = scan.nextLong();
			sum += amin[i];
		}

		for(int i = 0; i < b ; i++) {
			bmin[i] = scan.nextLong();
			sum += bmin[i];
		}
		
		
		if(sum < c) {
			count = a + b;
		}

		while(tempmin < c) {
			if(at && bt){
				break;

			}else if(at) {
				tempmin += bmin[bco];

			}else if(bt) {
				tempmin += amin[aco];

			}else {
				tempmin += Math.min(amin[aco], bmin[bco]);
	
			}
			
			if(tempmin <= c ) count++;
			
			if(Math.min(amin[aco], bmin[bco]) == amin[aco]) {
				aco++;
				if(aco >= a) {
					aco = a;
					at = true;
				}

			}else {
				bco++;
				if(bco >= b) {
					bt = true;
					bco = b;
				}
			}

		}

		System.out.println(count);


	}


}