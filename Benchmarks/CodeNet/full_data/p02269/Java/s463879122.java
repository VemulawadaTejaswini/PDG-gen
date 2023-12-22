import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main{
	public static void main(String[] args){
		short hashDictionary[] = new short[244140630];	//辞書のハッシュを保存
		for (int i = 0; i < 244140630; i++){
			hashDictionary[i] = 0;
		}
		
		Scanner sc = new Scanner(System.in);								//標準入力
		short numOfInput = sc.nextShort();												//データ数
		
		for (int i = 0; i < numOfInput; i++){
			String order = sc.next();
			
			//入力された文字のハッシュ値を求める
			short newHash = hash(sc.next());
			
			//新しい辞書の追加
			if (order.equals("insert") == true){				
				//ハッシュ値を追加
				hashDictionary[newHash] = 1;
				
			}else{
				if (hashDictionary[newHash] == 1){
					System.out.println("yes");
				}else{
					System.out.println("no");
				}
			}
		}
	}
	
	private static short hash(String word){
		short result = 0;
		
		for (int i = 0; i < word.length(); i++){
			char c = word.charAt(i);
			
			if (c == 'A'){
				result += 1 * Math.pow(5,i);
			}else if (c == 'C'){
				result += 2 * Math.pow(5,i);
			}else if (c == 'T'){
				result += 3 * Math.pow(5,i);
			}else{
				result += 4 * Math.pow(5,i);
			}
		}
		
		return result;
	}
}
