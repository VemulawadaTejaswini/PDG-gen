import java.util.*;
public class Main {
	
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		List<String> ng = new ArrayList<>();
		for (int i = 0; i < K; i++) {
			ng.add(sc.next());
		}
		
		int min = Integer.MAX_VALUE;
		for (int i = N; i <= 100_000; i++) {
			String val = String.valueOf(i);
			
			if (!ng.stream().anyMatch(ngChar -> val.contains(ngChar))) {
				min = Math.min(i, min);
			}
		}
		
		System.out.println(min);
	}
}
