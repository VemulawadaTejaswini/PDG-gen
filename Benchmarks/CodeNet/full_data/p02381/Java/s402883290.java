import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		double dev = 0.0;
		Scanner sc = new Scanner(System.in);

		do {
			int n = sc.nextInt();

			if (n == 0) {
				break;
			}

			int[] grade = new int[n];

			for (int i = 0; i < n; i++) {
				grade[i] = sc.nextInt();
			}

			dev = deviation(grade);

			System.out.println(dev);


		}while(true);

		sc.close();
	}

	private static double deviation(int[] grade) {
		double deviation = 0;

		for (int i = 0; i < grade.length; i++) {
			deviation += Math.pow( grade[i] - average(grade) , 2);
		}

		deviation /= grade.length;
		deviation = Math.sqrt(deviation);
		return deviation;
	}

	public static double average(int[] grade) {
		double average = 0;

		for (int i = 0; i < grade.length; i++) {
			average += grade[i];
		}

		average /= grade.length;

		return average;
	}


}

