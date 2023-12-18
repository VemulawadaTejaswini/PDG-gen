//b
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] list = new int[N];

		long sum = 0;

		for(int i=0;i<N;i++ ) {

			list[i] = sc.nextInt();

			sum += list[i];
		}

		sort(list);

		int a = list[N-1]/2;

		System.out.println(sum-a);

	}

	public static void sort(int[] a) {

		//System.out.println("A");
		int h;

		for(h=1; h<a.length/9; h=h*3+1);

		for(;h>0;h/=3) {

			for(int i=h; i<a.length; i++) {

				for(int j=i; j>=h && a[j-h]>a[j]; j-=h) {

					int temp = a[j];

					a[j] = a[j-h];

					a[j-h] = temp;
				}

			}
		}
	}

}
