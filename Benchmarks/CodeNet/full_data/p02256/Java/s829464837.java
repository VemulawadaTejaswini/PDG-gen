
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//自然数X、Yの最大公約数の計算
		int x,y;
		Scanner sc = new Scanner(System.in);

		x = sc.nextInt();
		y = sc.nextInt();
		sc.close();

		int maxN = 0;
		//Xの約数リスト作成
		//Yの約数リスト作成
		//X、Yの最大公約数の算出

		ArrayList<Integer> dListX = new ArrayList<>(divisor(x));
		ArrayList<Integer> dListY = new ArrayList<>(divisor(y));

		for(int i = 0; i < dListX.size(); i++){
			for(int j = 0; j < dListY.size(); j++){
				int value = 0;
				if(dListX.get(i).equals(dListY.get(j))){
					value = dListX.get(i);
					if(maxN<value){
						maxN = value;
					}
				}

			}

		}
		System.out.println(maxN);
	}

	private static ArrayList<Integer> divisor(int value){
		ArrayList<Integer> dList = new ArrayList<>();
		for(int i = 1 ; i < value; i++){
			if(value % i == 0){
				dList.add(value / i);
			}
		}
		return dList;

	}
}
