import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n, m;
		int z = 8000000;
		while (true) {
			n = sc.nextInt();
			m = sc.nextInt();
			int num = n;
			if (n == 0) {
				break;
			}
			boolean[] check = new boolean[z];
			//true...以前の倍数
			//false...以前全てと互いに素
			for (int i = 0; i < m; i++) {//blockの数だけループ
				for (int j = num; j < z; j += num) {
					check[j] = true;
				}
				//n以上で初めてfalseであるcheckを探す
				//num = n;
				while (check[num]) {
					num++;
				} //END while
			} //END for(i)
			System.out.println(num);
		} //END while(true)
		sc.close();
	}
}

