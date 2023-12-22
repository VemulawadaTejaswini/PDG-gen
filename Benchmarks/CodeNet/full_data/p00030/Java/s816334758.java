import java.util.Scanner;
 import java.util.ArrayList;
 import java.util.List;
 
 public class Main{
 	public static void main(String[] args){
 		//データの読み取りの準備
 		Scanner sc = new Scanner(System.in);
 		
 		while(true){
 			//データの読み取り
 			int n = sc.nextInt();
 			int s = sc.nextInt();
 			
 			int result;
 			List<Integer> initalAvalable = new ArrayList<Integer>(){
 				{
 					add(0);
 					add(1);
 					add(2);
 					add(3);
 					add(4);
 					add(5);
 					add(6);
 					add(7);
 					add(8);
 					add(9);
 				}
 			};
 			
 			//終了条件の判定
 			if(n == 0 && s == 0){
 				break;	
 			}
 			
 			//確実に不可能な条件を分離
 			int max = 0;
 			int min = 0;
 			for (int i = 0; i < n; i++){
 				max += 9 - i;
 				min += i;
 			}
 			
 			if (s < min || max < s){
 				System.out.println(0);
 				continue;
 			}
 			
 			//探索を実行
 			result = search(n,s,initalAvalable);
 			
 			//結果の重複を除去
 			for (int k = 1; k <= n; k++){
 			   result /= k;
 		   }
 			
 			//結果を出力
 			System.out.println(result);
 		}
 	}
 	
 	//serch(使う数の残り個数,残りの合計,使える数のリスト)->パターンの数
 	private static int search(int num, int sum, List<Integer> avalable){
 	   
 		//結果の格納用変数
 		int result = 0;
 		
 		//再帰の一番下
 		if (num == 1){
 			//avalableを探索して、sumと一致するものがなければ0を返す
 			if (avalable.contains(sum)){
 			   return 1;
 			}else{
 				return 0;
 			}
 		}
 		
 		else{
 			//荒い条件フィルターをかけて、結果が存在しないものをフィルタリング
 			if (sum <= 0 || 9 * num <= sum){
 				return 0;
 			}else{
 				for (int j = 0; j < avalable.size(); j++){
 					//全てのパターンについて再帰処理
 					List<Integer> nextAvalable = new ArrayList<Integer>(avalable);
 					nextAvalable.remove(j);
 					result += search(num - 1, sum - avalable.get(j), nextAvalable);
  				}
 				return result;
 			}
 		}
 	}
 }
