import java.util.Scanner;

public class Main {
	
	void run() {
		// 素数の配列
		int[] array = new int[150000];
		array[2] = 1;
		outside : for(int i = 3; i < array.length; i++) {
			for(int j = 0; j < i; j++) {
				if(array[j] == 0) continue;
				if(i%j == 0) continue outside;
			}
			array[i] = 1;
		}
		// 入力
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count = 0;
		for(int i = 0; i < n; i++) {
			int input = scan.nextInt();
			if(array[input] != 0) count++;
		}
		// 出力
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}

