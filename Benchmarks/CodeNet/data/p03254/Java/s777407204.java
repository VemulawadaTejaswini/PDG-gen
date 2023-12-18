

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int x = sc.nextInt();

		int a[] = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}

		Arrays.sort(a);

		int count = 0;

		for(int i = 0; i < n; i++){
			if(x >= a[i] && i != n - 1){
				count++;
				x -= a[i];
			}
			else if(i == n - 1 && a[i] == x){
				count++;
			}
			else {
				break;
			}
		}

		System.out.println(count);
	}
}
