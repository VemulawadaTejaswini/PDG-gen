
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			if (n== 0)
				break;
			Map<String, Integer> map = new HashMap<String, Integer>();
			while(n-->0){
				String str  = scanner.next();
				int cost = scanner.nextInt();
				map.put(str, cost);
			}
			int s = scanner.nextInt();
			while(s-->0){
				String str = scanner.next();
				int m = scanner.nextInt();
				int sum=0;
				while(m-->0){
					sum+=map.get(scanner.next());
				}
				map.put(str, Math.min(map.get(str), sum));
			}
			System.out.println(map.get(scanner.next()));
			
		}
	}
}