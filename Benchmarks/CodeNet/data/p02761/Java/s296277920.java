import java.util.*;
import java.lang.Math;

public class Main{
	public static void main(String args[]){
		call();
	}

	public static void call(){
		Scanner sc = new Scanner(System.in);
		int keta = sc.nextInt();
		int numOfData = sc.nextInt();
		Map<Integer,Integer> map = new HashMap<>(numOfData);
		//mapに桁数と値を入れる
		//キーの値が更新されそうになったら、-1を出力して終了する
		for(int i = 0; i < numOfData; i++){
			int key = 0;
			int value = 0;
			key = sc.nextInt();
			value = sc.nextInt();
			if(map.containsKey(key) && map.get(key) != value){
				System.out.println(-1);
				return;
			}
			map.put(key,value);
		}
		//一桁目が0になる指定があれば、-1を出力して終了する
		int ans = 0;
		for(int key: map.keySet()){
			if(key == 1){
				if(map.get(key) == 0){
					System.out.println(-1);
					return;
				}
			}
			//指定された桁に値を代入する
			ans += map.get(key) * Math.pow(10, keta - key);
		}
		//答えが指定された桁数より小さければ、桁数を10の累乗を足すことで合わせる
		if(ans < Math.pow(10, keta -1)){
			ans += Math.pow(10, keta -1);
		}
		System.out.println(ans);
		return;
	}
}
