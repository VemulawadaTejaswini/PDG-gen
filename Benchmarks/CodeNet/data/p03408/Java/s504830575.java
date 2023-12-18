import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<String, Integer> countMap = new HashMap<>();
		for(int i = 0; i < n; i++) {
			String word = sc.next();
			countMap.put(word, countMap.containsKey(word) ? countMap.get(word) + 1 : 1);
		}
		int m = sc.nextInt();
		for(int i = 0; i < m; i++){
			String word = sc.next();
			countMap.put(word, countMap.containsKey(word) ? countMap.get(word) -1 : -1);
		}
		System.out.println(Math.max(countMap.entrySet().stream().max((e1, e2) -> e1.getValue() - e2.getValue()).get().getValue(), 0));
	}
}