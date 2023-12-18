import java.util.*;
import java.math.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(), M = in.nextInt();
        for (int i = 0; i < M; i++) {
            int left = i;
            int right = N - 1 - i - (N % 2 == 0 && N >= 6 && i == M - 1 ? 1 : 0);
            System.out.println((left + 1) + " " + (right + 1));
        }
    }
}