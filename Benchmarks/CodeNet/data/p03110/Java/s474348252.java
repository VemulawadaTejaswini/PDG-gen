import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		double[] x = new double[num];
		String[] u = new String[num];
		int answer = 0;
		for(int i = 0; i < num; i++) {
			x[i] = sc.nextDouble();
			u[i] = sc.next();
			if(u[i].equals("BTC")) {
				answer += x[i]*380000;
			}
			else answer += x[i];
		}
		System.out.println(answer);
	}

}
