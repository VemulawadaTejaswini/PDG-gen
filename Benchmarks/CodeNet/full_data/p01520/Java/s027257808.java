    import java.util.Scanner;
     
    public class Main {
     
    static Scanner sc = new Scanner(System.in);
    static int N, T, E;
    static int[] x;
     
    static int solve() {
    for (int i = 0; i < N; ++i) {
    for (int t = x[i]; t <= T + E; t += x[i]) {
    if (t >= T - E) return i + 1;
    }
    }
    return -1;
    }
     
    public static void main(String[] args) {
    N = sc.nextInt();
    T = sc.nextInt();
    E = sc.nextInt();
    x = new int[N];
    for (int i = 0; i < N; ++i) {
    x[i] = sc.nextInt();
    }
    System.out.println(solve());
    }
    }