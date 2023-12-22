

import java.util.Scanner;

public class Main {

    static int k;
    static int[] T = new int[100000];
    static int n;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        for(int i = 0; i < n; i++){
            T[i] = sc.nextInt();
        }
        long ans = solve();
        System.out.println(ans);
    }

    public static long solve(){
        long left = 0;
        long right = 100000 * 10000;
        long mid;
        while(right - left > 1){
            mid = (right + left) / 2;
            int v = check(mid);
            if(v >= n){
                right = mid;
            }else{
                left = mid;
            }
        }
        return right;
    }
    public static int check(long P){
        int i = 0;
        for(int j = 0; j < k; j++){
            long s = 0;
            while(s + T[i] <= P){
                s += T[i];
                i++;
                if(i == n){
                    return n;
                }
            }
        }
        return i;
    }
}

