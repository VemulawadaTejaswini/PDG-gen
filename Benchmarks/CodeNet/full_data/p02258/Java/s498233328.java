
public class Main {

		/**
		 * それぞれの購入地点から得られる最大利ざやを求め、
		 * 最も利益の大きい値を出力する
		 * @param args
		 */
		public static void main(String args[]){

			int num = Integer.parseInt(args[0]);
			int[] value = new int[num];
			int profit = -100;
			for(int i = 0;i < num;i++){
				value[i] = Integer.parseInt(args[i+1]);
			}

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
		public static int Exchange(int buy, int[] value,int n){

			int max_sell = -100000;
			for(int i = n; i < value.length;i++){
				if(max_sell < value[i]){
					max_sell = value[i];
				}
			}
			return max_sell - buy;
		}

		//R[i]で勝った時のそれぞれの最大値について求めていく漢字？
		//R[1]で買ったらー２、－４、－２、－１、－２となるのでー１をR[i]にいれるようにする
		//最終的にR[i]で大きい値が最大利益となる
}
