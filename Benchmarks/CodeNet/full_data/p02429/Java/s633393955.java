import java.util.Scanner;

public class Main  {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);

		int n = scan.nextInt();
		int k = scan.nextInt();
		
		int[] array = new int[k];
		for(int i=0; i<k; i++) {
			array[i] = scan.nextInt();
		}

		for(int i=0; i<Math.pow(2, k); i++){
			int[] array2 = new int[n];
			int tmp = i;
			int index = 0;
			for(int j=0; tmp>0; j++) {
				if(tmp %2 == 1) {
					array2[array[j]] = 1;
					index += Math.pow(2, array[j]);
				}
				tmp /= 2;
			}
			
			System.out.print(index + ":");
			for(int j=0; j<k; j++) {
				if(array2[array[j]] == 1) System.out.print(" " + array[j]);
			}
			System.out.println();
		}
	}
}
