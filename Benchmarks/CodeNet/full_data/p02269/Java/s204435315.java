import java.util.Scanner;
import java.util.HashMap;

public class Main{
	public static void main(String[] args){
		HashMap<Integer,Integer> hashDictionary = new HashMap<Integer,Integer>();
		
		Scanner sc = new Scanner(System.in);								//標準入力
		int numOfInput = sc.nextShort();												//データ数
		
		for (int i = 0; i < numOfInput; i++){
			String order = sc.next();
			
			//入力された文字のハッシュ値を求める
			int newHash = hash(sc.next());
			
			//新しい辞書の追加
			if (order.equals("insert") == true){				
				//ハッシュ値を追加
				hashDictionary.put(newHash, 1);
				
			}else{
				if (hashDictionary.containsKey(newHash) == true){
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
