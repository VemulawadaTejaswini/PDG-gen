import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long a, max, min, sum;
		min = 1000001;
		max = -1000001;
		sum = 0;
		for(int i = 0; i < n; i++) {
			a = sc.nextInt();
			if(a < min)	min = a;
			if(a > max)	max = a;
			sum += a;
		}
		System.out.printf("%d %d %d\n",min,max,sum) ;
	};
}

