

import java.util.Arrays;
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

		Arrays.sort(a);

		int minIndex = 0;
		int mingcd = a[0];

		for(int i = 1; i < n; i++){
			int tmp = gcd(mingcd, a[i]);

			if(tmp < mingcd){
				mingcd = tmp;
				minIndex = i;
			}
		}

		int gcd = a[0];
		for(int i = 1; i < n; i++){
			if(i == minIndex){
				continue;
			}
			gcd = gcd(a[i], gcd);
		}

		System.out.println(gcd);
	}

	static int gcd(int a, int b){
    	int tmp;

    	while (a % b != 0)
    	{
    		tmp = b;
    		b = a % b;
    		a = tmp;
    	}
    	return b;
    }
}
