import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//変数//
		int H;		//縦ピクセル数
		int W;		//横ピクセル数
		
		String[] C;		//入力されたピクセル
		
		Scanner scan = new Scanner(System.in);
		
		//入力//
		H = scan.nextInt();
		W = scan.nextInt();
		
		C = new String[H];
		for(int i = 0; i < H; i++ ){
			C[i] = new String(scan.next());
		}
		
		scan.close();
		
		//処理//
		//結果//
		for(int i = 0; i < H; i++){
			System.out.println(C[i]);
			System.out.println(C[i]);
		}
		
	}
	
}
