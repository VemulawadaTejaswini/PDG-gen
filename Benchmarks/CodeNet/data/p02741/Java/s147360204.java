import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int idx = sc.nextInt();
		int[] datas = {1, 1, 1, 2, 1, 2, 1, 5, 2, 2, 1, 5, 1, 2, 1, 14, 1, 5, 1, 5, 2, 2, 1, 15, 2, 2, 5, 4, 1, 4, 1, 51};
		for(int i = 0; i < 32; i++) {
			if(i+1 == idx) {
				System.out.println(datas[i]);
			}
		}
	}
}
