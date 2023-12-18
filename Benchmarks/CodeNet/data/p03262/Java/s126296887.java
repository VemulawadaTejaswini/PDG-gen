import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int X = sc.nextInt();

		int[] x = new int[N];

		x[0] = sc.nextInt();

		int max = x[0];

		int min = x[0];

		int ansMax = 0;	//答えになりうる値の最大値

		for(int i=1;i<N;i++) {

			x[i] = sc.nextInt();

			if(max < x[i] || min > x[i]) {

				max = x[i];

				min = x[i];

			}

		}

		ansMax = Math.max(Math.abs(X-max), Math.abs(X-min));	//絶対値が大きい方

		boolean flag;

		//System.out.println(ansMax);

		for(int i = ansMax;i>0;i--) {	//D

			flag = true;

			for(int j=0;j<x.length;j++) {

				if(i %2 == 0 && (Math.abs(x[j])-X)%2 != 0) {

					flag = false;

					break;
				}

				if(Math.abs(x[j] - X ) < i ) {

					flag = false;

					break;

				}




				if(Math.abs(x[j] - X) % i != 0) {

					flag = false;

					break;
				}
			}

			if(flag == true) {

				System.out.println(i);

				break;
			}




		}

	}

}
