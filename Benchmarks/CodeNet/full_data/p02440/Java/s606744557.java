import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int prog[] = new int[n];
		for(int i = 0; i < n; i++) {
			prog[i] = sc.nextInt();
		}

		int q = sc.nextInt();
		for(int i = 0; i < q; i++) {
			int com = sc.nextInt();
			int b = sc.nextInt();
			int e = sc.nextInt();
			if(com == 0) {  //最小値
				int min = prog[b];
				for(int j = b + 1; j < e; j++) {
					if(prog[j] < min) min = prog[j];
				}
				System.out.println(min);
			}
			else {
				int max = prog[b];
				for(int j = b + 1; j < e; j++) {
					if(prog[j] > max) max = prog[j];
				}
				System.out.println(max);
			}
		}
	}

}

