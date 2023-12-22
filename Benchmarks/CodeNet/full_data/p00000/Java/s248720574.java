public class Main {
	public static void main(String[] args) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				int ni = i + 1;
				int nj = j + 1;
				int a = ni * nj;
				System.out.println(ni + "x" + nj + "=" + a);
			}
		}
	}
}