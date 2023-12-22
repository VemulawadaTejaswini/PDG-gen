import java.util.Scanner;

public class Main {

		/**
		 * それぞれの購入地点から得られる最大利ざやを求め、
		 * 最も利益の大きい値を出力する
		 * @param args
		 */
		public static void main(String args[]){
			Scanner scan = new Scanner(System.in);
			int num = scan.nextInt();
			int[] value = new int[num];
			for(int i = 0;i < num;i++){
				value[i] = scan.nextInt();
			}

			int profit = -100;
			for(int j = 0; j< num; j++){
				if(profit < Exchange(value[j],value,j+1)){
					profit = Exchange(value[j],value,j+1);
				}
			}
			System.out.println(profit);
		}
		
		/**
		 * 購入地点からの最大利ざやを求める
		 * @param buy		買値
		 * @param value	価格変動値
		 * @param n		何番目から売りに入るか
		 * @return
		 */
		static int Exchange(int buy, int[] value,int n){
			int max_sell = -100000;
			for(int i = n; i < value.length;i++){
				if(max_sell < value[i]){
					max_sell = value[i];
				}
			}
			return max_sell - buy;
			}
}

