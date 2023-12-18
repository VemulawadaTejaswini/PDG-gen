import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		Map<Integer, Integer> map = new HashMap<>();
		
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int h1 = sc.nextInt();
		
		for(int i = 0; i < N - 1; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int h = sc.nextInt();
			
			if(i == 0) {
				for(int j = 0; j <= 100; j++) {
					for(int k = 0; k <= 100; k++) {
						int check = -Math.abs(x1 - j) - Math.abs(y1 - k) + Math.abs(x - j) + Math.abs(y - k) - (h1 - h);
						if(check == 0) {
							map.put(j, k);
						}
					}
				}
			} else {
				Map<Integer, Integer> map2 = new HashMap<>();
				for(Map.Entry<Integer, Integer> en : map.entrySet()) {
					int check = -Math.abs(x1 - en.getKey()) - Math.abs(y1 - en.getValue()) + Math.abs(x - en.getKey()) + Math.abs(y - en.getValue()) - (h1 - h);
					if(check == 0) {
						map2.put(en.getKey(), en.getValue());
					}
				}
				map = map2;
			}
		}
		map.forEach((a, b) -> System.out.println(a + " " + b + " " + (h1 + Math.abs(x1 - a) + Math.abs(y1 - b))));
	}
}
