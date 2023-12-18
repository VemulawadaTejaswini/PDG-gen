import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		int[][] array=new int[n][2];

		for(int i=0;i<n;i++) {
			array[i][0]=sc.nextInt();
			array[i][1]=sc.nextInt();
		}
		Arrays.sort(array, (a, b) -> Integer.compare(a[0], b[0]));

		for(int i=0;i<n;i++) {
			if(array[i][1]<=t) {
				System.out.println(array[i][0]);
				System.exit(0);
			}
		}
		System.out.println("TLE");
	}
}

//Arrays.sort(array, (a, b) -> Integer.compare(a[0], b[0]));


