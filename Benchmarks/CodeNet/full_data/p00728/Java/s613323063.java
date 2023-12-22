
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, w, sum = 0;
		int min = 1000;
		int max = 0;
		while (true) {
			w = sc.nextInt();
			sum=0;
			min = 1000;
			max = 0;
			if(w==0)
				break;
			for (int i = 0; i < w; i++) {
				n = sc.nextInt();
				sum += n;
				if (n > max)
					max = n;
				if (n < min)
					min = n;

			}
			System.out.println((sum - (max + min)) / (w - 2));
		}
	}
}