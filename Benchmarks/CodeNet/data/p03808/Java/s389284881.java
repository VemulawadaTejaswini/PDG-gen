import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			int A = sc.nextInt();
			if (map.containsKey(A)) {
				int mp = map.get(A) + 1;
				map.put(A, mp);
			} else {
				map.put(A, 1);
			}
		}
		boolean b = false;
		for (Integer key : map.keySet()) {
			if (map.get(key) > 1) {
				b = true;
			}
		}
		if(b == false){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
}