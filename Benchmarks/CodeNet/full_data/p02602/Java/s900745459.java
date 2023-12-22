import java.math.*;
import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) arr[i] = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        int pre = 0;
        int post = k;

        for (int i=0; i<n-k; i++) {
            if (arr[pre]<arr[post]) {
                sb.append("Yes" + "\n");
            } else {
                sb.append("No" + "\n");
            }
            pre++;
            post++;
        }

        System.out.print(sb.toString());

    }

}

