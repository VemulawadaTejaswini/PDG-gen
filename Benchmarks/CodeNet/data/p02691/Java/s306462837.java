

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int a[] = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}

		int result = 0;
		for(int i = 0; i < n; i++){
			if(a[i] >= n){
				continue;
			}
			for(int j = i + 1; j < n; j++){
				int dn = j - i;
				int sa = a[i] + a[j];

				if(dn == sa){
					result++;
				}
			}
		}

		System.out.println(result);
	}

}
