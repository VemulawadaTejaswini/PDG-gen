public class Main {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int[] ret = new int[2];
		for(int i = 0; i < 3; i++) {
			int tmp = sc.nextInt();
			if(tmp == 5)
				ret[0]++;
			if(tmp == 7)
				ret[1]++;
		}
		System.out.println(ret[0] == 2 && ret[1] == 1 ? "YES" : "NO");
	}
}