import java.util.Scanner;
public class Main{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] a = new int[n];


		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}


		boolean flag = true;



		int x = 0;
		int max = 0;
		int maxA = 0;

		while(flag == true) {

			flag = false;
			max = 0;
			for(int i=0;i<a.length;i++) {
				if(a[i]%2==0 && a[i]>max) {
					max = a[i];
					maxA = i;
					flag = true;
				}
			}

			for(int i=0;i<a.length;i++) {

				if(i==maxA) {
					a[i] = a[i]/2;
				}else {
					a[i] *= 3;
				}
				//System.out.println(a[i]);
			}


			if(flag == false) break;
			x++;
		}


			System.out.println(x);



	}
}
