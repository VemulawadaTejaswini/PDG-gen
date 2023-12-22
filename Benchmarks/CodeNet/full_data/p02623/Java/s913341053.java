

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		long k = sc.nextInt();

		int a[] = new int[n];
		int b[] = new int[m];

		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}

		for(int i = 0; i < m; i++){
			b[i] = sc.nextInt();
		}

		long sum = 0;
		int indexA = 0;
		int indexB = 0;
		int count = 0;
		while (sum <= k && (indexA < n || indexB < m)){
			if(indexA == n){
				sum += b[indexB];
				indexB++;
			}
			else if(indexB == m){
				sum += a[indexA];
				indexA++;
			}
			else if(a[indexA] <= b[indexB]){
				sum += a[indexA];
				indexA++;
			}
			else {
				sum += b[indexB];
				indexB++;
			}

//			System.out.println("A "+indexA+" B "+indexB+" sum "+sum);
			if(sum <= k){
				count++;
			}
		}

		System.out.println(count);
	}
}