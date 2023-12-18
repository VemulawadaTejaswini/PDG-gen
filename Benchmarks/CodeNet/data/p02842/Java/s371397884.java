import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		
		//金額取得
		int input = scan.nextInt();
		
		//税抜き計算
		//切り上げ価格
		int ceil =(int) Math.ceil(input/1.08);
		
		//切り捨て価格
		int floor =(int)Math.floor(input/1.08);
		
		if((int)Math.floor(ceil*1.08)==input) {
			System.out.println(ceil);
		}
		else if((int)Math.floor(floor*1.08)==input) {
			System.out.println(floor);
		}
		else {
			System.out.println(":(");
		}
		
		
	}

}
