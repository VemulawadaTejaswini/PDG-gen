import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		double[] nums = new double[n];
		String[] strs = new String[n];
		
		for(int i=0; i<n; i++) {
			nums[i] = sc.nextDouble();
			strs[i] = sc.next();
		}
		
		double sum = 0;
		
		for(int i=0; i<n; i++) {
			if(strs[i].equals("JPY")) {
				sum += nums[i];
			}else if(strs[i].equals("BTC")) {
				sum += nums[i]* (380000.0);
			}else {
				throw new RuntimeException("wrong input");
			}
		}
		System.out.println(sum);
	}
}
