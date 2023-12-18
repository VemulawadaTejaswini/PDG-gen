import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int N = sc.nextInt();
		for(int i = 0; i < N; i++) {
			int num = sc.nextInt();
			if(map.containsKey(num)) {
				System.out.println("NO");
				return;
			}
			map.put(num, 1);
		}
		System.out.println("YES");
	}
}
