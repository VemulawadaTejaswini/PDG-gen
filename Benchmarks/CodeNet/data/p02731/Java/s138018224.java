import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int l = kb.nextInt();
		double k1 = 0.01;
		double k2 = 0.01;
		double k3 = l - 0.02;
		double sum = k1 * k2 * k3;
		//System.out.println(sum);
		while (k1 <= l-0.02) {
			k2 = k1;
			k3 = l - k1 - k2;
			while (k2 <= k3) {
				double sum2 = k1 * k2 * k3;
				if (sum < sum2)
					sum = sum2;
				k2 += 0.01;
				k3 -= 0.01;
			}
			k1 += 0.01;
		}
		System.out.println(sum);
		kb.close();
	}

}
