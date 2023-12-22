import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int i,j;

		while(scan.hasNext()) {
			int[] list = new int[n];

			for(i=0;i<n;i++) {
				list[i]=scan.nextInt();
			}

			for(j=n-1;j>=0;j--) {
				System.out.print(" "+list[j]);
			}

			System.out.println();
		}
		scan.close();
	}

}

