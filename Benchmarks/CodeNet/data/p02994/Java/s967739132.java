import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();
        int[] tastes = new int[N];
        int min = Integer.MAX_VALUE;
        int total = 0;
        int index = 0;
        for (int i = 0; i < N; i++) {
            int taste = L+i;
            total += taste;
            tastes[i] = taste;
            int moo = Math.min(min, Math.abs(taste));
            if (moo < min) {
                min = moo;
                index = i;
            }
        }
        System.out.println(total-tastes[index]);
    }
}