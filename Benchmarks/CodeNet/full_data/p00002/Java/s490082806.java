import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????

		int a;
		int b;
		int sum[] = new int[3];

		Scanner sc = new Scanner(System.in);

		for(int i = 0;i<3;i++){

		a = sc.nextInt();
		b = sc.nextInt();
		int ans = a+b;
		String stAns = Integer.toString(ans);
		int count = stAns.substring(0).length();
		sum[i] = count;
		}
		for(int i = 0;i<3;i++){

		System.out.println(sum[i]);

		}

	}

}