import java.util.ArrayList;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);

		ArrayList<String[]> all = new ArrayList<String[]>();
		int count = 0;

		while (true) {
			String[] kari = new String[2];
			kari[0] = sc.nextLine();

			if (kari[0].equals("0")) {
				break;
			}

			kari[1] = sc.nextLine();

			all.add(kari);
			count++;
		}

		for (int i = 0; i < count; i++) {
			String[] kari = all.get(i);
			double n = Double.parseDouble(kari[0]);
			String[] stu = kari[1].split(" ");
			double[] student = new double[(int)n];
			double sum = 0;
			for (int j = 0; j < n; j++) {
				student[j] = Double.parseDouble(stu[j]);
				sum += student[j];
			}
			double m = sum / n;

			double answer = 0;
			for (int j = 0; j < n; j++) {
				answer += (student[j] - m) * (student[j] - m);
			}
			System.out.println(Math.sqrt(answer/n));
		}

	}

}