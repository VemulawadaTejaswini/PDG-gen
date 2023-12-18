import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);
    Map<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();
        long[] arr = new long[n+1];
        arr[0] = 2;
        arr[1] = 1;

        long ans = 0;

        for (int i=2; i<=n; i++) {
            arr[i] = arr[i-1]+arr[i-2];
        }

        System.out.println(arr[n]);
    }

}
