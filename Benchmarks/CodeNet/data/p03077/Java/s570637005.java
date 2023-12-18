

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();
		long a[] = new long[5];
		long take[] = new long[5];

		for(int i = 0; i < 5; i++){
			a[i] = sc.nextLong();
			take[i] = (n + a[i] - 1)/a[i];
		}

//		System.out.println(takeA + " "+takeB+" "+takeC+" "+takeD+" "+takeE);


		long result = take[0];

		for(int i = 1; i < 5; i++){
			if(take[i] > take[0]){
				result += take[i] - take[0] + 1;
			}
			else {
				result++;
			}
		}

		System.out.println(result);
	}

}