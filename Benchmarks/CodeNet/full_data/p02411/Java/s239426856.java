

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		while(true){
			int m = sc.nextInt();
			int f = sc.nextInt();
			int r = sc.nextInt();


			if(m == -1 && f == -1 && r == -1){
				break;
			}

			int sum = m + f;


			if(m == -1 || f == -1){
				System.out.println('F');
			}
			else if(80 <= sum){
				System.out.println('A');
			}
			else if(65 <= sum && sum < 80){
				System.out.println('B');
			}
			else if(50 <= sum && sum < 65){
				System.out.println('C');
			}
			else if(30 <= sum && sum < 50){

				if(r >= 50){
					System.out.println('C');
				}
				else{
					System.out.println('D');
				}
			}
			if(30 > sum){
				System.out.println('F');


			}



		}

	}

}