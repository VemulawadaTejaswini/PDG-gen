import java.util.Scanner;


class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		long[] x = new long[n];
		long l, r;
		long min = 100000000;
		for(int i = 0;i < n;i++){
			x[i] = sc.nextLong();
		}


		for(int i = 0;i < n - k + 1;i++){
			l = Math.abs(x[i]) + Math.abs(x[i + k - 1]-x[i]);
			r = Math.abs(x[i + k - 1]) + Math.abs(x[i]-x[i + k - 1]);
			if(min > l) min = l;
			if(min > r) min = r;
		}

		System.out.println(min);
	}
}