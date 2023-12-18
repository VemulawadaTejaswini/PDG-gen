import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		int N = keyboard.nextInt();
		//キーがStringで中身がintのHashMapを作る
		HashMap<String, Integer> count = new HashMap<String, Integer>();
		
		for (int s=0; s<N; s++) {
			String S = keyboard.next();
			int now = count.get(S) == null ? 0 : count.get(S);
			count.put(S, now + 1);
		}
		
		int M = keyboard.nextInt();
		for (int t=0; t<M; t++) {
			String T = keyboard.next();
			int now = count.get(T) == null ? 0 : count.get(T);
			count.put(T, now - 1);
		}
		
		int ans = 0;
		//拡張for分（左が確認する1個の名前、右が確認するものの集合）
		//HashMapでキーが登録されている部分のintの集合を、valとして1個ずつ順番に全部確認する
		//右にcount.keysと書くと、全てのキーの集合が取れるし、count.entrySetなら全てのキーと中身のセットの集合が取れる
		for (int val: count.values()) { 
			if (ans < val) {
				ans = val;
			}
		}
				
		System.out.println(ans);
		keyboard.close();
	}
	
}
