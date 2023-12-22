import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextDouble()) {
			double[] p = new double[8];
			for (int i = 0; i < 8; i++)
				p[i] = sc.nextDouble();
			double s = 0.0;
			s += (p[0]-p[2])*(p[4]-p[6])+(p[1]-p[3])*(p[5]-p[7]);
			System.out.println(s==0.0?"YES":"NO");
		}
	}
}