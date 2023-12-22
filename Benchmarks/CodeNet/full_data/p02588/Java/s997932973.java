import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int n = Integer.parseInt(sc.next());
		double[] a = new double[n];
		for(int i = 0; i < n; i++) {
			a[i] = Double.parseDouble(sc.next());
		}
		int sum = 0;
		for(int i = n - 1; i > 0; --i) {
			for(int j = i - 1; j > 0; --j) {
				Double mul = a[i] * a[j];
				if(mul == Math.floor(mul)) {
					++sum;
					//System.out.println(a[i]+ " " + a[j] + " " + mul);
				}
			}
		}
		
		System.out.println(sum);

	}
}

