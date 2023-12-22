import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] schoolNum = new int[5];
		double[] weight = new double[5];
		double[] tall = new double[5];
		double[] bmi = new double[5];
		for (int i = 0; i < 5; i++) {
			schoolNum[i] = sc.nextInt();
			weight[i] = sc.nextDouble();
			tall[i] = sc.nextDouble();
		}
		for (int i = 0; i < 5; i++) {
			bmi[i] = weight[i] / Math.pow(tall[i], 2);
			if(bmi[i] >= 25) System.out.println(schoolNum[i]);
		}
	}
}