import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();

		// 平方根
		double tmp = Math.sqrt(X);
		int tmp2 = (int)tmp;
		int ans = tmp2 * tmp2;

		// 立方根
		tmp = Math.cbrt(X);
		tmp2 = (int)tmp;
		int ans2 = tmp2 * tmp2 *tmp2;

		if (ans >= ans2){
			System.out.println(ans);
		}else{
			System.out.println(ans2);
		}
	}
}