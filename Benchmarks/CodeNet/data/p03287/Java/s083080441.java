import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] a = new int[n];
		a[0] = in.nextInt()%m;
		int zero = 0;
		if(a[0]==0) zero++;
		for(int i=1;i<n;i++) {
			a[i] = (a[i-1]+in.nextInt())%m;
			if(a[i]==0) zero++;
		}
		Arrays.sort(a);
		long sum = zero;
		int num = a[0];
		int count = 1;
		for(int i=1;i<n;i++) {
			if(num==a[i]) {
				count++;
			}else {
				sum += (count*(count-1))/2;
				count = 1;
				num = a[i];
			}
		}
		sum += (count*(count-1))/2;
		System.out.println(sum);
		in.close();
	}

}
