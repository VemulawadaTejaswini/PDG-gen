import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		//データの読み込みの準備
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		
		int counter = 0;
		
		while (true){
			//一単語ずつ代入
			String temp = sc.next();
			
			//終了条件の確認
			if (temp.equals("END_OF_TEXT")){
				break;	
			}
			
			//大文字小文字を無視して比較
			if (word.equalsIgnoreCase(temp)){
				//一致した場合は、カウンターを加算
				counter++;
			}
		}
		
		//結果を出力
		System.out.println(counter);
	}
}
