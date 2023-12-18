import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		List<Integer> ship1 = new ArrayList<>();
		List<Integer> ship2 = new ArrayList<>();
		for(int i = 0; i < M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a == 1) {
				ship1.add(b);
			}
			if(b == N) {
				ship2.add(a);
			}
		}
		
		for(int i:ship1) {
			if(ship2.contains(i)) {
				System.out.println("POSSIBLE");
				break;
			}else System.out.println("IMPOSSIBLE");
		}
	}
}