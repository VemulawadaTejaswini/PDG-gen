

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int d = sc.nextInt();

		int count[] = new int[100];
		for(int i = 2; i <= d; i++){
			int n = i;
			int div = 2;

			while(n > 1){
				if(n%div == 0){
					n /= div;
					count[div]++;
				}
				else{
					div++;
				}
			}
		}

//		for(int i = 1; i <= 20; i++){
//			System.out.print(count[i] + " " );
//		}
//		System.out.println();
		int moreThan4 = 0;
		int moreThan2 = 0;
		int moreThan14 = 0;
		int moreThan24 = 0;

		for(int i = 0; i < count.length; i++){
			if(count[i] >= 4){
				moreThan4++;
			}
			if(count[i] >= 2){
				moreThan2++;
			}
			if(count[i] >= 14){
				moreThan14++;
			}
			if(count[i] >= 24){
				moreThan24++;
			}
		}

//		System.out.println(moreThan4 + " " + moreThan2);
		int result;
		if(moreThan4 >= 2 && moreThan2 >= 3){
			result = moreThan4*(moreThan4 - 1)/2 * (moreThan2 - 2);// - moreThan4*(moreThan4 - 1)*(moreThan4 - 2)/6;

			if(moreThan14 > 0){
				result += moreThan14*(moreThan4 - 1);// - moreThan14*(moreThan14 - 1)/2;
			}
			if(moreThan24 > 0){
				result += moreThan24*(moreThan2 - 1);// - moreThan24*(moreThan24 - 1)/2;
			}

			if(count[2] >= 74){
				result++;
			}
		}
		else {
			result = 0;
		}

		System.out.println(result);

	}

}
