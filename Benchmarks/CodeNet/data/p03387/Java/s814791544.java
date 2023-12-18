//ABC93_C Main

import java.util.Scanner;

public class Main{

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();

		int max = 0;
		int mid = 0;
		int min = 0;



		if (A>=C && A>=B) {

			if(B>=C) {

				max = A;
				mid = B;
				min = C;

				//System.out.println("typeA");


			}
			else {

				max = A;
				mid = C;
				min = B;

				//System.out.println("typeB");


			}

		}
		else if (B>=A && B>=C) {

			if(A>=C) {

				max = B;
				mid = A;
				min = C;

				//System.out.println("typeC");


			}
			else {

				max = B;
				mid = C;
				min = A;

				//System.out.println("typeD");


			}

		}
		else{

			if(A>=B) {

				max = C;
				mid = A;
				min = B;

				//System.out.println("typeE");


			}
			else {

				max = C;
				mid = B;
				min = A;

				//System.out.println("typeF");


			}

		}

		int d1 = max - mid;
		int d2 = mid - min;

		//System.out.println("d1:" + d1);
		//System.out.println("d2:" + d2);


		int N =0;


		if(d1%2 == 0 && d2%2 == 0) {

			N = (d1*2+d2)/2;

			//System.out.println("typeA");

		}
		else if(d1%2 == 1 && d2%2 == 0){

			N = 1 + ((d1-1)*2 + d2)/2;

			//System.out.println("typeB");


		}
		else if(d1%2 == 0 && d2%2 == 1) {

			N = 1 + (d1*2 + (d2+1))/2;

			//System.out.println("typeC");


		}
		else {

			N =  2 + ((d1-1)*2+(d2+1))/2; //  2 + ((d1-1)+(d2+1))/2;

			//System.out.println("typeD");


		}

		System.out.println(N);

	}
}