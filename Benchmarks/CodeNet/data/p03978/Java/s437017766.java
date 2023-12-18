import java.util.*;

class D {
    static final char[] bs = {'.', '#'};

    public static void main(String... args) {
        final Scanner sc = new Scanner(System.in);
        final int N = Integer.parseInt(sc.nextLine());
        final char[] up = new char[N];
        final char[] lo = new char[N];
        int cols = 0;
        loop1:
        for (; cols < N; cols++) {
            for (int i = 0; i < 2; i++)
                for (int j = 0; j < 2; j++) {
                    up[cols] = bs[i];
                    lo[cols] = bs[j];
                    System.out.println(new String(up, 0, cols + 1));
                    System.out.println(new String(lo, 0, cols + 1));
                    switch (sc.nextLine()) {
                        case "end":
                            return;
                        case "T":
                            continue loop1;
                        case "F":
                            break;
                        default:
                            throw null;
                    }
                }
            break;
        }
        for(int i = 1; i <= cols; i++) {
            up[N - i] = up[cols - i];
            lo[N - i] = lo[cols - i];
        }
        loop2:
        for (; cols < N; cols++) {
            for (int i = 0; i < 2; i++)
                for (int j = 0; j < 2; j++) {
                    up[N - cols - 1] = bs[i];
                    lo[N - cols - 1] = bs[j];
                    System.out.println(new String(up, N - cols - 1, cols + 1));
                    System.out.println(new String(lo, N - cols - 1, cols + 1));
                    switch (sc.nextLine()) {
                        case "end":
                            return;
                        case "T":
                            continue loop2;
                        case "F":
                            break;
                        default:
                            throw null;
                    }
                }
            break;
        }
    }
}
public class Main {
    public static void main(String... args) {
        D.main();
    }
}