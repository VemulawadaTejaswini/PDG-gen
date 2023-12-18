import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] lArr = new int[n];

        int max = 0;
        for (int i = 0; i < n; i++) {
            lArr[i] = sc.nextInt();
            max = Math.max(max, lArr[i]);
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (lArr[i] != max) sum += lArr[i];
        }

        System.out.println(sum > max ? "Yes" : "No");
    }
}
