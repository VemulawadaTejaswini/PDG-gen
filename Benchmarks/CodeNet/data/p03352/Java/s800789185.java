import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();

		double tmp = Math.sqrt(X);

		int tmp2 = (int)tmp;

		int ans = tmp2 * tmp2;

		if (ans * 2 > X){
			System.out.println(ans);
		}else{
			System.out.println(ans * 2);
		}

	}
}