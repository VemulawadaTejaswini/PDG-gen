
import java.util.Scanner;



public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		long a = 1;
		for (int i=0;i<k;i++) {
			System.out.println(a);
			a++;
			double min = a/digitSum(a);
			for (int j=0;j<Math.log10(a)+1;j++) {
				long b = (a/(long)Math.pow(10, j)*(long)Math.pow(10, j)+(long)Math.pow(10, j)-1);
				if (min>b/digitSum(b)) {
					min = b/digitSum(b);
					a=b;
				}
			}
		}
	}
	
	static double digitSum(long x) {
		double ans = 0;
		while (x>0) {
			ans += (x%10);
			x/=10;
		}
		return ans;
	}

}
