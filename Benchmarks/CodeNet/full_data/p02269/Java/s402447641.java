import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main{
	public static void main(String[] args){
		ArrayList<Integer> hashDictionary = new ArrayList<>();		//辞書のハッシュを保存
		Scanner sc = new Scanner(System.in);								//標準入力
		int numOfInput = sc.nextInt();												//データ数
		
		for (int i = 0; i < numOfInput; i++){
			String order = sc.next();
			
			//新しい辞書の追加
			if (order.equals("insert") == true){
				//入力された文字のハッシュ値を求める
				int newHash = hash(sc.next());
				
				//ハッシュ値を入れる場所を検索
				int place = Collections.binarySearch(hashDictionary, newHash);
				
				//ハッシュ値が既知のものでなければ追加
				if (place < 0){
					place = place * -1 - 1;
					hashDictionary.add(place, newHash);
				}
			}else{
				//入力された文字のハッシュ値を求める
				int newHash = hash(sc.next());
				
				int exist = Collections.binarySearch(hashDictionary, newHash);
				
				if (exist >= 0){
					System.out.println("yes");
				}else{
					System.out.println("no");
				}
			}
			
		}
	}
	
	private static int hash(String word){
		int result = 0;
		
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
