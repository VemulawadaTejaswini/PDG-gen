import java.util.*;

class Main {
    public static void main(String... args) {
        int N = IN.nextInt();
		int X = IN.nextInt();
		List<Integer> xs = new ArrayList<Integer>();
		xs.add(X);
		for (int i = 0; i < N; i++) {
			xs.add(IN.nextInt());
		}
		xs.sort((i, j) -> i - j);
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < N; i++) {
			ans = Math.min(ans, xs.get(i + 1) - xs.get(i));
		}
		puts(ans);
    }
    static final Scanner IN = new Scanner(System.in);
    static <T> void puts(T arg) { System.out.println(arg); }
}
