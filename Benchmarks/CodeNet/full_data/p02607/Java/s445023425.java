import java.math.*;
import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) arr[i] = sc.nextInt();

        int cnt = 0;

        for (int i=0; i<n; i+=2) {
            if (arr[i] % 2 == 1) cnt++;
        }

        System.out.print(cnt);

    }


}

