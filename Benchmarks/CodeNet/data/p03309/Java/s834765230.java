import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] a = new int[N];

		int sum = 0;


		for(int i=0;i<N;i++) {

			a[i] = sc.nextInt();

			sum += Math.abs(a[i] -(i+1));
		}

		//System.out.println(sum);

		//int min = 200001;

		int t = 0;

		//int min = 0;
		int min = 200001;
		for(int i=-N;i<N;i++) {
			//min = 200001;
			int b = 0;

			for(int j=0;j<N;j++) {

				//System.out.println("A"+(j+1+i));
				b += Math.abs(a[j]-(j+1+i));

				//System.out.println("b"+b+" "+i);

				if(Math.abs(b)>Math.abs(sum)) {
				//System.out.println("A");
					break;
				}


			}
			//System.out.println("s"+sum);
			//System.out.println(min);
			//System.out.println("b"+b);
			if(b<=Math.abs(sum)&& b<min) {
			//	System.out.println("C");
				min = b;
				//t = i;
			}
		}

		System.out.println(min);
	}
}
