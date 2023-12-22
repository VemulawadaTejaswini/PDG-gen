import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		long total = 1;
		for(int i = 0 ; i < n; i++) {
			a[i] = sc.nextLong();
			total *= a[i];
            if(a[i] == 0) {
            	break;
            }
		}
      	long s = (long)Math.pow(10, 18);
		if(total > s) {
			total = -1;
		}

		System.out.println(total);
	}

}