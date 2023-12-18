import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		(new Main()).execute();
	}
	public void execute() {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		long H[] = new long[N] ;
		long max = 0 ;
		boolean ans = true ;
		for(int i = 0 ; i < N ; i ++) {
			H[i]= sc.nextLong();
			if(max < H[i]) {
				max =  H[i];
			}
			if(H[i] < max - 1) {
				ans = false ;
				break ;
			}
		}

		if(ans) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
