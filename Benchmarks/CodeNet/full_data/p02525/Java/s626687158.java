import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			double[] s;
			double a;
			int n = sc.nextInt();
			int i;
			if(n == 0){
				break;
			}
			s = new double[n];
			for (i = 0; i < s.length; i++) {
				s[i] = sc.nextDouble();
			}
			double aver = 0;
			double var = 0;
			double sum = 0;
			for(i = 0;i < s.length; i++){
				sum = sum + s[i];
			}
			aver = sum / n;
			sum = 0;
			for(i = 0;i <s.length;i++){
				sum = sum + (s[i] - aver) * (s[i] - aver);
			}
			var = sum / n;
			a = Math.sqrt(var);
			System.out.println(a);

		}
	}
}