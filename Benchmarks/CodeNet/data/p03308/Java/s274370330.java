import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long max,min;
		max = 1;
		min = 100000000;
		for(int i=0;i<N;i++) {
			long a = sc.nextLong();
			if(a<min)
				min = a;
			if(a>max)
				max = a;
		}
		System.out.println(max-min);
	}
}