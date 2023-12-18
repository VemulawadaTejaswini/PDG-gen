import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int preT = 0;
		int preX = 0;
		int preY = 0;
		int N = sc.nextInt();
		boolean availableFlag = true;
		for(int i=0; i<N; i++) {
			int t = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();

			int difference = t - preT;
			int dist = Math.abs(x - preX) + Math.abs(y - preY);
			if(difference < dist || ((dist - difference) % 2 != 0)){
				availableFlag = false;
				break;
			}
			preT = t;
			preX = x;
			preY = y;
		}

		String result = availableFlag ? "Yes" : "No";
		System.out.println(result);

	}
}