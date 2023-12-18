import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
        int N = sc.nextInt();
        int[] i = new int[N];
        int[] j = new int[N];
        int[] k = new int[N];
        int a = 0, b = 0;

        for (int x = 0; x < N; x++) {
            i[x] = sc.nextInt();
            j[x] = sc.nextInt();
            k[x] = sc.nextInt();
            if (k[x]%2 == 0) {
                a = i[x];
                b = j[x];
                break;
            }
        }

        for (int x = 0; x < N; x++) {
            if (x == a || x == b) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }

		sc.close();
	}
}
