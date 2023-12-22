import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		for(;;){
			int n = scan.nextInt();
			if(n == 0){
				break;
			}
			int[] s = new int[n];
			int sum = 0;
			for(int i = 0; i < n; i++){
				s[i]  = scan.nextInt();
				sum += s[i];
			}
			double m = (double) sum / (double) n;
			for(int i = 0; i < n; i++){
				double a1 += Math.pow((double) s[i] - m, 2);
			}
			double al = Math.sqrt(a1 / (double) n);
		}
		System.out.printf("%f\n", al);
	}
}