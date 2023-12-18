import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        String[] s = new String[N];
        int[] t = new int[N];
        for (int i = 0; i < N; i++) {
            s[i] = sc.next();
            t[i] = Integer.parseInt(sc.next());
        }
        String X = sc.next();
        int xIndex = 0;
        for (int i = 0; i < N; i++) {
            if (X.equals(s[i])) {
                xIndex = i;
                break;
            }
        }
        int sum = 0;
        for (int i = xIndex + 1; i < N; i++) {
            sum += t[i];
        }
        System.out.println(sum);
    }
}
