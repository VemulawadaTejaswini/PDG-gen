import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			if(n == 0)
				break;
			int[] scores = new int[n];
			for(int i = 0; i < scores.length; i++)
				scores[i] = sc.nextInt();

			double ave = 0;
			double vari = 0;

			for(int i = 0; i < scores.length; i++)
				ave += scores[i];

			ave /= n;
			for(int i = 0; i < scores.length; i++)
				vari += Math.pow(scores[i] - ave, 2);

			vari /= n;

			System.out.printf("%.8f\n", Math.sqrt(vari));
		}
	}
}