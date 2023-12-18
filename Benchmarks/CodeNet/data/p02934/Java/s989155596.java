import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int seisu = scan.nextInt();
		double[] array = new double[seisu];
		double sum = 0;
		double gyaku = 0;

		for(int i=0;i<seisu;i++) {
			array[i] = scan.nextInt();
			sum += 1/array[i];
		}
		gyaku = 1/sum;

		System.out.println(gyaku);
		scan.close();
	}

}
