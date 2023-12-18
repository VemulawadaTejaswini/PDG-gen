import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		while(T>0) {

			long[] a = new long[4];

			for(int i=0;i<4;i++) {

				a[i] = sc.nextLong();
			}

			long diff = a[3]-a[1];

			long first = a[0] - a[1];

			boolean flag = true;

			long rec = 0;

			for(int i=0;i<100;i++) {


				if(first > a[2] && first < a[1]) {

					flag = false;

					break;
				}

				if(first > a[2]) {

					rec = diff*i;

					break;
				}

				first += diff;
			}

			long second = rec - a[1];



			for(int i=0;i<100;i++) {


				if(second > a[2] && second < a[1]) {

					flag = false;

					break;
				}

				second += diff;



			}

			if(a[1] > a[3]) {

				flag = false;
			}

			if(a[3] + a[2] < a[1]) {

				flag = false;
			}

			if(a[0] < a[1]) {

				flag = false;

			}


			if(flag == true) {

				System.out.println("Yes");

			}else {

				System.out.println("No");
			}

			T--;

		}

	}

}
