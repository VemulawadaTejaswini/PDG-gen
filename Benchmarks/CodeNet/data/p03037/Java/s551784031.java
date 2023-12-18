import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int data[][] = new int[m][2];

		for (int i = 0; i < m; i++) {
			data[i][0] = sc.nextInt();
			data[i][1] = sc.nextInt();
		}

		int a[] = new int[n];

		for (int i = 0; i < m; i++) {
			for (int j = 1; j < n+1; j++) {
				if (j < data[i][0] || data[i][1] < j) {
					a[j-1]++;
				}
			}
		}

		int count = 0;

		for (int i = 0; i < n; i++) {
			if (a[i] == 0) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}