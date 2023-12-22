import java.util.Scanner;
import java.lang.Math;

public class Main {

	public static void main(String args[]){

		int n,avg,sum,a2;
		Scanner in = new Scanner(System.in);


		while(true){
			n = Integer.parseInt(in.next());
			if(n == 0)break;

			int num[] = new int[n];
			sum = 0;
			a2 = 0;

			for(int i=0;i<n;i++){
				num[i] = Integer.parseInt(in.next());
				sum += num[i];
			}

			avg = sum/n;

			for(int i=0;i<n;i++){
				a2 += (num[i] - avg)*(num[i] - avg);
			}

			a2 = a2/n;

			System.out.printf("%.8f",Math.sqrt((double) a2 ));
		}

		in.close();
	}
}