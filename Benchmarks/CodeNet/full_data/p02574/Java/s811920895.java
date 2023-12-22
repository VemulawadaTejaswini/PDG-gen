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

    List<Integer> divide(int n){
        int tmp = (int) Math.sqrt(n);
        List<Integer> ans = new ArrayList<>();
        for(int i=2;i<=tmp;i++){
            if(n%i==0){
                ans.add(i);
                while(n%i==0){
                    n/=i;
                }
            }
        }
        if(n>1){
            ans.add(n);
        }
        return ans;
    }

    private void slove() {

        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] flag = new int[1000002];
        int ans = 1;
        for (int i = 0; i < n ; i++) {
            List<Integer> prime = divide(a[i]);
            for (int j = 0; j < prime.size(); j++) {
                if (ans == 1 && flag[prime.get(j)] > 0) {
                    ans++;
                }
                flag[prime.get(j)]++;
            }
        }
        if (ans == 1) {
            System.out.println("pairwise coprime");
            return ;
        }
        boolean f = Arrays.stream(flag).anyMatch(p -> p >= n);
        System.out.println(f?"not coprime":"setwise coprime");



    }

    public static void main(String[] args) {
        new Main().slove();
    }
}
