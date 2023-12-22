import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		while(true){
			//縦と横のint型の変数
			int intHeight = scan.nextInt();
			int intWidth = scan.nextInt();

			//縦と横の長さがともに０の時ループを抜ける
			if(intHeight == intWidth && intHeight == 0){
				break;
			}
			//縦のループ
			for(int i = 0 ;i < intHeight;i++){
				//段数が奇数の時,＃から出力する
				if(i % 2 == 0){
					//横の出力
					for(int j = 0;j < intWidth;j++){
						if(j % 2 == 0){
							System.out.print("#");
						}else if(j % 2 == 1){
							System.out.print(".");
						}
					}
					System.out.println("");
				//段数が偶数の時,"."から出力する
				}else if(i % 2 == 1){
					for(int j = 0;j < intWidth;j++){
						if(j % 2 == 0){
							System.out.print(".");
						}else if(j % 2 == 1){
							System.out.print("#");
						}
					}
					System.out.println("");
				}
			}

			//AOZの制約のための空行
			System.out.println("");
		}
			scan.close();
	}
}

