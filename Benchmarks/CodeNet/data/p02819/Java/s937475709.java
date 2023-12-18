
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		int max_size = 1000000020 + 1;
		boolean[] list = new boolean[max_size];
		for(int i = 0; i < max_size; i++) {
			list[i] = true;
		}
		
		
		// エラトステネスの篩を作る
		int root_max = (int) Math.sqrt(max_size) + 1;
		for(int i = 2; i < root_max; i++) {
			// list[i] == trueなら、素数
			if(list[i]) {
				// 倍数だけをfalseにする
				for(int j = i * 2; j < max_size; j+=i) {
					list[j] = false;
				}
			}
		}

		//System.out.println(list[x]);
		while(true) {
			if(list[x]) {
				System.out.println(x);
				break;
			}
			x++;
		}

	}
}