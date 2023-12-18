import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < n; i++){
			int tmp = scanner.nextInt();
			list.add(tmp);
			if(map.containsKey(tmp)){
				map.put(tmp, map.get(tmp) + 1);
			}else{
				map.put(tmp, 1);
			}
		}
//		for(int j : map.keySet()){
//			System.out.println(j + " : " +map.get(j));
//		}
		Map<Integer, Integer> resultMap = new HashMap<Integer, Integer>();
		for(int k : list){
			int result = 0;
			if(resultMap.containsKey(k)){
				System.out.println(resultMap.get(k));
			}else{
				for(int j : map.keySet()){
					if(j == k){
						result += comb(map.get(j)-1);
					}else{
						result += comb(map.get(j));
					}
				}
				System.out.println(result);
				resultMap.put(k, result);
			}

		}
	}

	private static int comb(int input){
		return input*(input-1)/2;
	}

}
