
import java.io.BufferedInputStream;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(new BufferedInputStream(System.in));

    public static void main(String[] args) {
        int N = sc.nextInt();
//        int K = sc.nextInt();
        long K = sc.nextLong();
        int[] a = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            a[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> mymap = new HashMap<>();
        HashMap<Integer, Integer> mymap2 = new HashMap<>();
        int cur = 1;
        int jump = 0;
        while (mymap.get(cur) == null) {
            mymap.put(cur, jump);
            mymap2.put(jump, cur);
//            System.out.println(jump + " " + cur);
            jump += 1;
            cur = a[cur];
        }
        int temp = mymap.get(cur);

        int num = mymap.size();

//        System.out.println(temp);

        if (K < temp) {
//            System.out.println(K);
//            System.out.println(mymap2.get(0));
            System.out.println(mymap2.get(K));
        } else {
            int ans = (int) ((K - temp) % (num - temp));
            ans = mymap2.get(ans + temp);
            System.out.println(ans);
        }
    }
}