import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        List<Integer> alist = new ArrayList<>();
        List<Integer> blist = new ArrayList<>();
        int takahashi = 0;
        int aoki = 0;

        for (int i = 0; i < n; i++) {
            alist.add(sc.nextInt());
            blist.add(sc.nextInt());
        }
        int now = 0;
        while (alist.size() > 0) {
            int max_a = alist.get(0);
            int max_b = blist.get(0);
            int num_a = 0;
            int num_b = 0;
            int other_a = 0;
            int other_b = 0;
            for (int i = 0; i < alist.size(); i++) {
                if (max_a < alist.get(i)) {
                    max_a = alist.get(i);
                    other_b = blist.get(i);
                    num_a = i;
                }
                if (max_b < blist.get(i)) {
                    max_b = blist.get(i);
                    other_a = alist.get(i);
                    num_b = i;
                }
            }

            System.out.println(num_a);
            System.out.println(num_b);
            System.out.println(max_a);
            System.out.println(max_b);

            int sa_a = Math.abs(alist.get(num_a) - blist.get(num_a));
            int sa_b = Math.abs(alist.get(num_b) - blist.get(num_b));

            if (now % 2 == 0) {
                if (sa_a <= sa_b) {
                    takahashi = takahashi + max_a;
                    alist.remove(num_a);
                    blist.remove(num_a);
                    now++;
                } else {
                    takahashi = takahashi + other_a;
                    alist.remove(num_b);
                    blist.remove(num_b);
                    now++;
                }
            } else {
                if (sa_a <= sa_b) {
                    aoki = aoki + other_b;
                    alist.remove(num_a);
                    blist.remove(num_a);
                    now++;
                } else {
                    aoki = aoki + max_b;
                    alist.remove(num_b);
                    blist.remove(num_b);
                    now++;

                }


            }
            System.out.println("takahashi is " + takahashi);
            System.out.println("aoki is " + aoki);

        }
        System.out.println(takahashi - aoki);


    }
}



\\とちゅうのやつ