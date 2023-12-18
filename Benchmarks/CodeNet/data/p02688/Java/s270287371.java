import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int K = stdIn.nextInt();
		HashMap<Integer, Boolean> n = new HashMap<Integer, Boolean>();
		
		for(int i = 0; i < K; i ++) {
			int d = stdIn.nextInt();
			for(int j = 0; j < d; j ++) {
				int sunuke = stdIn.nextInt();
				if(n.get(sunuke) == null) {
					n.put(sunuke, true);
				}
			}
		}
		System.out.println(N - n.size());
	}
}