import java.util.*;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		int a = sc.nextInt();
		double height = (t - a) / 0.006;
		int min = 0;
		double min_value = Double.MAX_VALUE;
		for (int i = 0 ; i < n; i++) {
			double tmp = Math.abs(height - sc.nextInt());
			if (tmp < min_value) {
				min_value = tmp;
				min = i + 1;
			}
		}
		System.out.println(min);
	}
	
	
}