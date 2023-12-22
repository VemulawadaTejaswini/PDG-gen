    import java.util.Random;
    import java.util.Scanner;
     
    public class Main {
     
    static Scanner sc = new Scanner(System.in);
    static int N;
    static int[][] g;
     
    static void solve() {
    Random rand = new Random();
    int[] hist = new int[N];
    for (int i = 0; i < 100; ++i) {
    System.out.println(rand.nextInt(N) + 1);
    System.out.flush();
    int ai = sc.nextInt() - 1;
    ++hist[ai];
    }
    double[] exp = new double[N];
    double sum = 0;
    for (int i = 0; i < N; ++i) {
    for (int j = 0; j < N; ++j) {
    exp[i] += 1. * g[i][j] * hist[j] / 100;
    }
    sum += exp[i];
    }
    for (int i = 100; i < 1000; ++i) {
    double r = rand.nextDouble() * sum;
    for (int j = 0; j < N; ++j) {
    r -= exp[j];
    if (r <= 0) {
    System.out.println(j + 1);
    System.out.flush();
    break;
    }
    }
    }
    }
     
    public static void main(String[] args) {
    N = sc.nextInt();
    g = new int[N][N];
    for (int i = 0; i < N; ++i) {
    String line = sc.next();
    g[i][i] = 1;
    for (int j = i + 1; j < N; ++j) {
    if (line.charAt(j) == 'o') {
    g[i][j] = 3;
    } else {
    g[j][i] = 3;
    }
    }
    }
    solve();
    }
    }