import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] x = new int[5];
		x[0] = sc.nextInt();
		x[1] = sc.nextInt();
		x[2] = sc.nextInt();
		x[3] = sc.nextInt();
		x[4] = sc.nextInt();
		sc.close();
		int answer = 0;
		for(int i = 0; i < 5; i++) {
			if(x[i] == 0) {
				answer = i + 1;
			}
		}
		prtln(answer);
	}

	public static <T> void prtln(T t) { System.out.println(t); }
}
