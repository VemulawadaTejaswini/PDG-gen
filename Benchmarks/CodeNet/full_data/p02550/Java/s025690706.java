//package src.com.jetman.atcoder;

import java.util.*;

/**
 * @description:
 * @author: Jetman
 * @create: 2020-08-29 14:39
 **/
public class Main {

    Scanner sc = new Scanner(System.in);

    long MOD = 998244353L;

    long dp[];

    private void slove() {

        long n = sc.nextLong();
        long x = sc.nextInt();
        long m = sc.nextInt();

        int[] flag = new int[(int)m+1];
        int index = 1;
        long tmp = x;
        flag[(int)x] = 1;
        long sum = x;
        int lun = 0;
        long start = 0;
        while (true) {
            if (index == n) {
                break;
            }
            tmp = (tmp*tmp)%m;
            if (flag[(int)tmp] > 0) {
                lun = index - flag[(int)tmp];
                start = tmp;
                break;
            }
            flag[(int)tmp] = index;
            sum = (sum+tmp)%m;
            index++;
        }

        if (index > n) {
            x = start;
            n = n-index;
            sum = (sum * (n/lun))%m;
            long nu = n%index;
            tmp = x;
            for (int i = 0; i < nu; i++) {
                sum = (sum+(tmp))%m;
                tmp = (tmp*tmp)%m;
            }
        }
        System.out.println(sum);



    }

    private void build(Map<Integer, List<Integer>> edge, int l, int r) {
        List<Integer> list = edge.getOrDefault(l, new ArrayList<>());
        list.add(r);
        edge.put(l,list);
    }


    public static void main(String[] args) {
        new Main().slove();
    }
}
