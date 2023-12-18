import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		long[] b = new long[n];
		for(int i=0; i<n; i++){
			a[i] = sc.nextLong();
			b[i] = sc.nextLong();
		}
		sc.close();
		
		long num = 0;
		
		for(int i=n-1; i>=0; i--){
			long m = b[i] - (a[i] + num + b[i]) % b[i];
			if(m != b[i]){
				num += b[i] - (a[i] + num + b[i]) % b[i];
			}
		}
		System.out.println(num);
	}

}
