import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    int MOD = (int)1e9 + 7;

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        int pos = 0;
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == 1) pos = i;
        }

        int l = 0;
        int r = 0;

        while (arr[l] != 1) l++;

        r = n - l - 1;

        int cnt = 0;
        int rem = 0;

        if (m == 2) {
            System.out.println(n-1);
            return;
        }

        System.out.println(n / (m-1));



    }

}

