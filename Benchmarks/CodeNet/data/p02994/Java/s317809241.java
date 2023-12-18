import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();
        int[] tastes = new int[N];
        int min = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < N; i++) {
            int taste = L+i;
            tastes[i] = taste;
            int moo = Math.abs(taste);
            if (moo < min) {
                min = moo;
                index = i;
            }
        }
        System.out.println(Arrays.stream(tastes).sum()-tastes[index]);
    }
}