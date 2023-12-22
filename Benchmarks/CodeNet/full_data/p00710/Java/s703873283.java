import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main{
	public static void main(String[] args){
		//変数
		ArrayList<Integer> cards = new ArrayList<>();	//カードの格納
		int n = -1;																//カードの枚数
		int r = -1;																//シャッフルの回数
		Scanner sc = new Scanner(System.in);						//標準入力
		
		while (true){
			//カードの枚数と、シャッフルの回数を読み取り
			n = sc.nextInt();
			r = sc.nextInt();
		
			//終了条件の判定
			if (n == 0 && r == 0){
				break;	
			}
			
			//データの初期化
			for (int i = 1; i <= n; i++){
				cards.add(i);
			}
		
			//データのシャッフル
			for (int i = 0; i < r; i++){
				int end = n - sc.nextInt();
				int start = end - (sc.nextInt() - 1);
				cards = shuffle(cards, start, end);
			}
		
			System.out.println(cards.get(n - 1));
		}
	}
	
	private static ArrayList<Integer> shuffle(ArrayList<Integer> cards,int start, int end){
		for (int i = start; i <= end; i++){
			int temp = cards.get(start);
			cards.remove(start);
			cards.add(temp);
		}
		return cards;
	}
}
