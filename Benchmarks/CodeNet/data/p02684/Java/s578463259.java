import java.util.*;

public class Main{

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();
        long k = sc.nextLong();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) arr[i] = sc.nextInt() - 1;

        int[] cnt = new int[n];
        cnt[0] = 1;

        int start = Integer.MAX_VALUE;

        int idx = arr[0];
        cnt[idx]++;
        outer:
        for (int i=1; i<n; i++) {
            int tmp = arr[idx];
            cnt[tmp]++;
            if (cnt[tmp] == 2) {
                start = tmp;
                break outer;
            }
            idx = tmp;
        }


        int before = 0;
        idx = arr[0];


        if (start != 0) {
            before++;
            out:
            for (int i=1; i<n; i++) {
                int tmp = arr[idx];
                before++;
                idx = tmp;
                if (tmp == start) break out;
            }

        }

        int circle = 0;
        idx = arr[0];

        if (start == 0) {
            circle++;
            for (int i=1; i<n; i++) {
                int tmp = arr[idx];
                circle++;
                if (tmp == start) break;
                idx = tmp;
            }
        } else {
            for (int i=1; i<n; i++) {
                int tmp = arr[idx];
                idx = tmp;
                if (tmp == start) {
                    circle++;
                    tmp = arr[tmp];
                    while (tmp != start) {
                        circle++;
                        tmp = arr[tmp];
                    }
                    break;
                }
            }
        }

//        System.out.println(circle);

        long remain = circle != 0 ? (k - before) % circle : k - before;

//        System.out.println(remain);


//        System.out.println(remain);
//        System.out.println(before);
//        System.out.println(start);


        idx = arr[start];
        if (remain == 0) {
            System.out.println(start + 1);
        } else {
            for (int i=0; i<remain-1; i++) {
                int tmp = arr[idx];
                idx = tmp;
                System.out.println(idx + 1);
            }

        }






    }


}
