import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int res = 0;
        int N = sc.nextInt();
        int[] L = new int[N];
        for(int i = 0; i < N; i++) L[i] = Integer.parseInt(sc.next());
        Arrays.sort(L);
        for(int i = 0; i < N; i++) {
            for(int j = i + 1; j < N; j++) {
                res += Math.max(0, ~Arrays.binarySearch(L, L[i] + L[j]) - j - 1);
            }
        }
        System.out.println(res);
    }
}
