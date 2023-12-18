import java.util.Scanner;

public class Main {

	private int N = 0;
	private int A = 0;
	private int B = 0;

	public static void main(String[] args) {

		Main myself = new Main();
		myself.execute();

	}

	/**
	 * 実処理メソッド
	 */
	public void execute() {

		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		A = sc.nextInt();
		B = sc.nextInt();

		int costPlan1 = A * N;
		int costPlan2 = B;

		System.out.println(costPlan1 <= costPlan2 ? costPlan1 : costPlan2);

		sc.close();

	}

}
