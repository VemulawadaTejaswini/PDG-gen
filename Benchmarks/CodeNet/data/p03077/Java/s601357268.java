import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long[] passenger = new long[5];
		for(int i=0;i<5;i++) {
			passenger[i]=sc.nextLong();
		
		}
		Arrays.sort(passenger);
		
		System.out.println((long)Math.ceil(((double)n/(double)passenger[0])+4));
		}
	}
