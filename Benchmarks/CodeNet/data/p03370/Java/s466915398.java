import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] ms = new int[N];

        for (int i = 0; i < N; i++) {
            ms[i] = sc.nextInt();
        }
        Arrays.sort(ms);
        int sum = 0;
        for (int m : ms) {
            sum += m;
        }
        int num = (X - sum + ms[0]) / ms[0];
        System.out.println(num + N - 1);
    }
}
