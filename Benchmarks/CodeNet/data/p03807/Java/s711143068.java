import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] aArr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            aArr[i] = sc.nextInt();
            sum += aArr[i];
        }

        System.out.println(sum%2 == 0 ? "YES" : "NO");
    }
}
