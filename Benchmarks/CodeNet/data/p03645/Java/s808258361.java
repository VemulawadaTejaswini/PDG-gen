import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] array1 = new int[m];
        int[] array2 = new int[m];
        for (int i = 0; i < m; i++) {
            array1[i] = sc.nextInt();
            array2[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < m; i++) {
            if (array1[i] == 1) {
                for (int j = 0; j < m; j++) {
                    if (array1[j] == array2[i] && array2[j] == n) {
                        ans = 1;
                    }
                }
            }
        }
        if (ans == 1) {
            System.out.println("POSSIBLE");
        } else {
            System.out.println("IMPOSSIBLE");
        }
    }
}
