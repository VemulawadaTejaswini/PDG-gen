import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = sc.nextInt();
        }
        int ans = 0;
        parent : for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                if (list[i] > list[j]) {
                    continue parent;
                }
            }
            ans++;
        }
        System.out.println(ans);
    }
}