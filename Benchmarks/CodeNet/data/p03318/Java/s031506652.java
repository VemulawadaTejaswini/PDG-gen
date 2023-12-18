import java.util.Scanner;

public class Main {
	
	public static double compute(long l) {
		long sum = 0;
		long t = l;
		while (t > 0) {
			sum += t % 10;
			t /= 10;
		}
		return (double)l / sum;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int k = s.nextInt();
		
		long current = 1;
		for (int i = 0; i < k; i++) {
			double min = Double.MAX_VALUE;
			long next = -1; 
			String currentString = current + "";
			for (int j = 0; j < currentString.length() + 1; j++) {
				String ender = "";
				for (int m = 0; m < j; m++) {
					ender += "9";
				}
				String temp = currentString.substring(0, currentString.length() - j) + ender;
				long tempVal = new Long(temp);
				double ans = compute(tempVal);
				if (ans < min) {
					min = ans;
					next = tempVal;
				}
			}
			System.out.println(next);
			current = next + 1;
		}
	}

}
