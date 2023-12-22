import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int k = scan.nextInt();
		
		for(int i=0; i<Math.pow(2, n); i++) {
			int[] array = new int[n];
			int count = 0;
			int tmp = i;
			
			for(int j=0; tmp>0; j++) {
				if(tmp % 2 == 1) {
					array[j] = 1;
					count++;
				}
				tmp /= 2;
			}
			
			if(count == k) {
				System.out.print(i + ":");
				for(int j=0; j<n; j++) {
					if(array[j] == 1) System.out.print(" " + j);
				}
				System.out.println();
			}
		}
		
	}
}
