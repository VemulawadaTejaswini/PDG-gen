import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// 標準入力からデータを読み込む準備
		Scanner sc = new Scanner(System.in);
		// 最初の文字の固まりを整数値と想定して読み込む
		int x,y;
		while (true) {
			int H = sc.nextInt();
			int W= sc.nextInt();
			if (H == 0 && W == 0) {
				break;
			}
			// 二重ループ(forの中にfor)を書いて、H x W個の # を表示しよう！
			for(x=1;x<=H;x++){
				for(y=1;y<=W;y++){
					if(x%2==1){
						if(y%2==1){
							System.out.printf("#");
						}
						if(y%2==0){
							System.out.printf(".");
						}
					}
					if(x%2==0){
						if(y%2==1){
							System.out.printf(".");
						}
						if(y%2==0){
							System.out.printf("#");
						}
					}
					
				}
				System.out.printf("\n");
			}
		}
	}
}