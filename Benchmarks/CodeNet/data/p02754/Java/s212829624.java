import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();

		boolean flg = false;
		int cnt = 0;
		for(int i = 0; i < N; i++) {
			for(int a = 0; a < A; a++) {
				cnt++;
				if(flg){
					i++;
				} else {
					flg = true;
				}
				if(i == N) break;
			}
			for(int b = 0; b < B; b++) {
				if(flg){
					i++;
				} else {
					flg = true;
				}
			}
		}
		System.out.println(cnt);
	}

}
