import java.util.Scanner;
public class Main {
public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
		long x = sc.nextLong();

		long a[] = new long[n];
		long sum = 0;


		for(int i=0;i<n;i++) {
			a[i] = sc.nextLong();
		}

		int k = 1;
		int t=1;

		for(int i=n-1;i>0;i--) {
		k = 1;
			sum += a[i] + x;
			for(int j = i;j>0;j--) {
				sum += (k+1)*(k+1)*(a[j] - a[j-1]);
				if(5*a[j-1] + (k+1)*(k+1)*a[j-1] + 3*x > (k+2)*(k+2)*a[j-1] + 2*x) {
					k++;
					sum += x;
				}else {
					break;
				}
			}

			if(i == k-1) {
				sum += (k+1)*(k+1)*a[0] + x;
				i = i - (k-1);
				t = i;
			}else {

				sum += (k+1)*(k+1)*a[i - k] + x;
				i = i - (k-1);
				t = i;
			}
		}
		if(t != 0) {
			sum += 2*x + 5*a[0];
		}

		System.out.println(sum);

    }

}