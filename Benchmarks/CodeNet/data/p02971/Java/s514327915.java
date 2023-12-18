import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		int[] max = new int[n];
		for (int i =0;i<n;i++) {
			array[i]=sc.nextInt();
			max[i]=0;
		}


		for(int i=0;i < n; i++) {
			for(int j=0;j<n;j++) {
				if(i==j) {

				} else {
				if (max[i] < array[j]) max[i] = array[j];
				}

			}
		}

		for(int i=0; i < n; i++)
		System.out.println(max[i]);

		sc.close();
	}
}
