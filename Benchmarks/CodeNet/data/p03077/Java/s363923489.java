import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long n = scn.nextLong();
		long[] x = new long[5];
		x[0]=scn.nextLong();
		long min = x[0];
		for(int i = 1;i<5;i++) {
			x[i]=scn.nextLong();
			if(x[i]<min) {
				min=x[i];
			}
		}
		System.out.println(n/min+5);
		scn.close();
	}
}