import java.util.*;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double m = 0, a_2 = 0, a = 0;
		int n;
		n = sc.nextInt();
		double[] s = new double[n];
		for(int i = 0; i < n; i++){
			s[i] = sc.nextInt();
			m += s[i];
		}
		m /= n;
		for(int i = 0; i < n; i++){
			a_2 += (s[i] - m)*(s[i] - m);
		}
		System.out.println(Math.sqrt(a_2));
	}
}