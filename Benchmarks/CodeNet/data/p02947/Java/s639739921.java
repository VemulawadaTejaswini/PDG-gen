import java.util.*;
//実行時間超過＆1/13不正解
public class Main {
	public static void main(String[] args){
		//最終結果用
		int counter = 0;
		//入力
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		
		HashMap<String,String> map = new HashMap<String,String>();
		for(int i = 0; i < N; i++){
			//文字列入力
			String input = sc.next();
			//文字に分解
			String[] stringArray = input.split("");
			//文字ソート
			Arrays.sort(stringArray);
			//結合して文字列へ
			String sortedInput = String.join("", stringArray);

			if(map.containsKey(sortedInput)){
				int a = Integer.parseInt(map.get(sortedInput));
				counter += a;
				a++;
				map.put(sortedInput, "" + a);
			}else{
				//連想配列に追加
				map.put(sortedInput, "1");
			}
		}
		System.out.println(counter);
	}
}