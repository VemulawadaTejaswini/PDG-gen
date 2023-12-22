import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] S = new int[n];
        for (int i = 0; i < n; i++) {
            S[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        int[] T = new int[q];
        for (int i = 0; i < q; i++) {
            T[i] = sc.nextInt();
        }
        int count = 0;
        Arrays.sort(S);
        Arrays.sort(T);
        int idx = 0;
        for (int i = 0; i < q; i++) {
            for (int j = idx; j < n; j++) {
                if (T[i] == S[j]) {
                    idx = j;
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}