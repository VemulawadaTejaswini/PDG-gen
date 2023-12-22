import java.util.*;
class A {
	Scanner sc = new Scanner(System.in);
	private void p(Object...os) { System.out.println(Arrays.deepToString(os)); }
	public static void main(String...args) {
		new ProblemA().start();
	}
	private void start() {
		int stop = sc.nextInt();
		int[] list = new int[stop];
		for(int i = 0; i < stop; i++) list[0] = sc.nextInt();

		int work, j;
		for(int i = 2; i < list.length; i++) {
			work = list[i];
			list[0] = work;
			j = i - 1;
			while(work < list[i]) {
				list[j + 1] = list[j];
				j = j - 1;
			}
			list[j + 1] = work;
		}
	}
}