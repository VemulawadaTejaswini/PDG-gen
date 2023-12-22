import java.util.*;

public class Main{

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        new Main().run();
    }

    void run() {

        long[] arr = new long[3];

        for (int i=0; i<3; i++) arr[i] = sc.nextLong();

        long k = sc.nextLong();

        long sum = 0;

        long[] cnt = new long[3];

        for (int i=0; i<3; i++) {
            if (arr[i] > k) {
                cnt[i] = k;
                k = 0;
            } else {
                cnt[i] = arr[i];
                k -= arr[i];
            }
        }

//        for (int i=0; i<3; i++) System.out.println(cnt[i]);

        System.out.println(cnt[0] - cnt[2]);



    }
}
