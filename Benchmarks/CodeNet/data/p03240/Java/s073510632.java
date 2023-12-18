import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		List<Integer[]> list = new ArrayList<>();
		
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int h1 = sc.nextInt();
		
		if(N == 1) {
			System.out.println(x1 + " " + y1 + " " + h1);
		}
		
		for(int i = 0; i < N - 1; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int h = sc.nextInt();
			
			if(i == 0) {
				for(int j = 0; j <= 100; j++) {
					for(int k = 0; k <= 100; k++) {
						int check = -Math.abs(x1 - j) - Math.abs(y1 - k) + Math.abs(x - j) + Math.abs(y - k) - (h1 - h);
						if(check == 0) {
							Integer[] t = {j, k};
							list.add(t);
						}
					}
				}
			} else {
				List<Integer[]> list2 = new ArrayList<>();
				for(Integer[] t : list) {
					int check = -Math.abs(x1 - t[0]) - Math.abs(y1 - t[1]) + Math.abs(x - t[0]) + Math.abs(y - t[1]) - (h1 - h);
					if(check == 0) {
						list2.add(t);
					}
				}
				list = list2;
			}
		}
		Integer[] c = list.get(0);
		System.out.println(c[0] + " " + c[1] + " " + (h1 + Math.abs(x1 - c[0]) + Math.abs(y1 - c[1])));
	}
}
