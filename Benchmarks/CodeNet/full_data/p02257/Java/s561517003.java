import java.util.Scanner;

public class Main {
	
	void run() {
		// 素数の配列
		int[] array = new int[100000];
		outside : for(int i = 2; i < array.length; i++) {
			if(array[i] == 0) {
				for(int j = 0; j < i; j++) {
					if(array[j] != 1) continue;
					if(i%j == 0) continue outside;
				}
				array[i] = 1;
				for(int j = 2*i; j < array.length; j += i) {
					array[j] = -1;
				}
			}
		}
//		System.out.println("input");
		// 入力
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count = 0;
		for(int i = 0; i < n; i++) {
			int input = scan.nextInt();
			if(array[input] == 1) count++;
		}
		// 出力
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}

