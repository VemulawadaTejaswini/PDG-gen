import java.util.*;
 
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] b = new int[N];
        for (int i = 0; i < N; i++) {
            b[i] = sc.nextInt();
        }

        int[] ans = new int[N];
        for (int i = N-1; i >= 0; i--) {
            boolean delete = false;
            for (int j = i; j >= 0; j--) {
                if (b[j] == j+1) {
                    ans[i] = b[j];
                    delete = true;
                    while (j < i) {
                        b[j] = b[j+1];
                        j++;
                    }
                    break;
                }
            }
            if (!delete) {
                System.out.println(-1);
                return;
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.println(ans[i]);
        }
    }
}
