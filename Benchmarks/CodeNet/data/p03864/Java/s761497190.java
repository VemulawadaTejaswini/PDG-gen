import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x = sc.nextInt();
        int[] a = new int[N];
        for(int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        int answer = 0;
        for(int i = 0; i < N; i++) {
            int surplus = a[i] - x;
            if (surplus > 0) {
                a[i] -= surplus;
                answer += surplus;
            }
            if (i > 0) {
                int pairSurplus = a[i] + a[i-1] - x;
                if (pairSurplus > 0) {
                    a[i] -= pairSurplus;
                    answer += pairSurplus;
                }
            }
        }
        System.out.println(answer);
    }
}