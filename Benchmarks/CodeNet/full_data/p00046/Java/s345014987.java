import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		double max =0;
		double min= 100000000;

		for(int i = 0; i < 6 ; i++) {
			double mountain = stdin.nextDouble();
			if(max < mountain) {
				max = mountain;
			} if (min > mountain) {
				min = mountain;
			}
		}
		System.out.println(max - min);

	}

}