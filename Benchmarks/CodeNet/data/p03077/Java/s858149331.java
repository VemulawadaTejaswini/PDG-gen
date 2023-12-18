import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		long[] a = new long[5];
		long min = Long.MAX_VALUE;
		for(int i=0;i<5;i++) {
			a[i] = in.nextLong();
			if(a[i]<min) min = a[i];
		}
		System.out.println((n/min)+(n%min==0?4:5));
		in.close();

	}

}
