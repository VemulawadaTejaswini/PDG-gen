import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int array[] = new int[n];
		long sum = 0;
		long mod = ((long)Math.pow(10,9) + 7);
		for(int i=0;i<n;i++){
			array[i] = sc.nextInt();
			sum += array[i];
			sum %= mod;
		}
		long x = 0;
		for(int i=0;i<n;i++){
			sum -= array[i];
			if (sum < 0)
				sum += mod;
			x += array[i] * sum;
			x %= mod;
		}
		System.out.println(x);
		sc.close();
	}
}
