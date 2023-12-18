

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = sc.nextLong();

		long mask = 2;
		long result = 0;

		if(a % 2 == 0){
			if((b - a)%4 == 1 || (b - a)%4 == 2){
				result = 1;
			}
			else {
				result = 0;
			}
		}
		else {
			if((b - a)%4 == 0 || (b - a)%4 == 1){
				result = 1;
			}
			else {
				result = 0;
			}
		}
		for(int i = 1; i <= 50; i++){
			long maskedA = a&mask;
			long maskedB = b&mask;
//			System.out.println("i = "+ i+" "+maskedA+" "+maskedB);

			if(maskedA == 0 && maskedB != 0 && b % 2 == 0){
				result += mask;
			}
			else if(maskedA != 0 && maskedB == 0 && a % 2 == 1){
				result += mask;
			}
			else if(maskedA != 0 && maskedB != 0 && a % 2 == b % 2){
				result += mask;
			}

			mask *= 2;
		}

		System.out.println(result);
	}

}
