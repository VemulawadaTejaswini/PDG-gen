import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//金額取得
		int input = scan.nextInt();

		//おにぎり
		A:for(int i=0; i<=10; i++) {
			//サンドイッチ
			for(int j=0; j<=10; j++) {
				//クッキー
				for(int k=0; k<=10; k++) {
					//ケーキ
					for(int l=0; l<=10; l++) {
						//飴
						for(int m=0; m<=10; m++) {
							//パソコン
							for(int n=0; n<=10; n++) {
								int sum = 100*i+101*j+102*k+103*l+104*m+105*n;
								if(input==sum) {
									System.out.println("1");
									break A;
								}
							}
						}
					}
				}
			}
			System.out.println("0");
			break A;
		}
		
	}

}
