//package src.com.jetman.atcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @description:
 * @author: Jetman
 * @create: 2020-08-29 14:39
 **/
public class Main {

    Scanner sc = new Scanner(System.in);

    long MOD = 1000000000 + 7;
    boolean[] judge;
    List<Integer> prime ;

    void initial(int bound) {
        judge[0] = false;
        judge[1] = false;
        for (int i = 2; i <= bound; i++) {
            judge[i] = true;
        }

        for (int i = 2; i <= bound; i++) {
            if (judge[i]) {
                prime.add(i);
                //倍数不是
                for (int j = 2 * i; j <= bound; j += i) {
                    judge[j] = false;
                }
            }
        }
    }



    List<Integer> divide(int n){
        if (judge[n]) {
            return Arrays.asList(n);
        }
        int tmp = (int) Math.sqrt(n);
        List<Integer> ans = new ArrayList<>();
        int i = 0;
        while (prime.get(i) <= tmp && prime.get(i) <= n){
            int k = prime.get(i);
            if(n%k==0){
                ans.add(k);
                while(n%k==0){
                    n/=k;
                }
            }
            i++;
        }
        if(n>1){
            ans.add(n);
        }
        return ans;
    }

    private void slove() {

        int h = sc.nextInt();
        int w = sc.nextInt();
        int[] a = new int[h];
        int[] b = new int[h];
        for (int i = 0; i < h; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        int[] ans = new int[h];
        int index = 1;
        for (int i = 1; i <= h; i++) {
            if (index < a[i-1]) {
                ans[i-1] = index;
            } else if (index >= a[i-1] && index <= b[i-1]) {
                index = b[i-1]+1;
                ans[i-1] = index > w ? -1 : index;
            } else {
                ans[i-1] = index;
            }
        }

        //ans[h-1] = index > w ? -1 : index;

        for (int i = 0; i < h; i++) {
            System.out.println(ans[i] > 0 ? (i+1 + ans[i]-1) : -1);
        }





    }

    public static void main(String[] args) {
        new Main().slove();
    }
}
