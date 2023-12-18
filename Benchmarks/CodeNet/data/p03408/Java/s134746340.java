import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	Scanner sc;
	int N, M;
	String sAry[], tAry[];

	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		sc = new Scanner(System.in);
		N = sc.nextInt();
		sAry = Stream.generate(() -> sc.next()).limit(N).toArray(String[]::new);
		M = sc.nextInt();
		tAry = Stream.generate(() -> sc.next()).limit(M).toArray(String[]::new);
		sc.close();
      
		int max = 0;
		for(String s : sAry) max = Math.max(max, calc(s));

		System.out.println(max);
	}

	int calc(String s) {
		int res = 0;
		for(String b : sAry) {
			if(s.equals(b)) {
				res++;
			}
		}
		for(String r : tAry) {
			if(s.equals(r)) {
				res--;
			}
		}

		return res;
	}

}