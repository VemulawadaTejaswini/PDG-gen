//sucannerクラス使うためにインポート
import java.util.*;

class Main{
	//プログラムのエントリポイント
	public static void main(String[] args){
		//入力ストリームの生成
		Scanner sc = new Scanner(System.in);
		while (true) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if ( x == 0 && y== 0){
				break;
				if( x < y ){
				System.out.println( x + " " + y);
				} else {
				System.out.println( y + " " + x);
			}
		}
	}
}