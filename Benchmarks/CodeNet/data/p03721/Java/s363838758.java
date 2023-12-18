import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();

		ArrayManager am = new ArrayManager();

		for(int i = 0; i < N; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			am.insert(a, b);
		}
		sc.close();

		System.out.println(am.getKthSmallestNumber(K));
	}

}

class ArrayManager{
	private TreeMap<Integer, Long> map;

	ArrayManager(){
		map = new TreeMap<Integer, Long>();
	}

	void insert(int a, int b){
		//既に挿入済みの値ならbだけ増加
		if(map.containsKey(a)){
			map.put(a, map.get(a) + b);
		}
		//初めて挿入
		else{
			map.put(a, (long)b);
		}
	}

	//k番目に小さい数を返す
	int getKthSmallestNumber(int k){
		int ret; //探索済みの最大値
		int cur = 0; //探索済みのインデックス
		for(Entry<Integer, Long> e: map.entrySet()){
			ret = e.getKey();
			cur += e.getValue();
			if(cur >= k){
				return ret;
			}
		}
		return -1;
	}
}
