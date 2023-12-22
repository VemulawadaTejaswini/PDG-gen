import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int x = stdIn.nextInt();
		Long sum = stdIn.nextLong();
		Long min = sum;
		Long max = sum;
		Long j;

		for (int i = 0; i < x-1; i++) {
			 j = stdIn.nextLong();
			sum += j;
			min = Math.min(min, j);
			max = Math.max(max, j);
    	}
		stdIn.close();

		System.out.printf("%d %d %d%n",min,max,sum);


	}
}

