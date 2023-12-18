import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt() - 1;
		int Y = sc.nextInt() - 1;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int k = 1; k < N; k++) {
			map.put(k, 0);
		}
		for(int i = 0; i < N; i++) {
			for(int j = i + 1; j < N; j++) {
				int temp = Math.min(j - i, Math.abs(j - Y) + Math.abs(i - X) + 1);
				if(map.containsKey(temp)){
					map.put(temp, map.get(temp) + 1);
				}
			}
		}
		for(int k = 1; k < N; k++) {
			System.out.println(map.get(k));
		}
	}
}
