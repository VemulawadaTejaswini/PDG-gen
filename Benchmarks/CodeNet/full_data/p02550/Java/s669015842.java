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
        long[] allSum = new long[100003];
        allSum[1] = x;
        while (true) {
            if (index == n) {
                break;
            }
            tmp = (tmp*tmp)%m;
            index++;
            if (flag[(int)tmp] > 0) {
                lun = index - flag[(int)tmp];
                start = tmp;
                break;
            }
            flag[(int)tmp] = index;
            sum = (sum+tmp);
            allSum[index] = allSum[index-1] + tmp;
        }

        if ((long)index < n) {
            x = start;
            n = n-index+1;
            sum = sum + ((allSum[index-1] - allSum[index-lun-1]) * (n/lun));
            long nu = n%lun;
            tmp = x;
            for (int i = 0; i < nu; i++) {
                sum = (sum+(tmp));
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
