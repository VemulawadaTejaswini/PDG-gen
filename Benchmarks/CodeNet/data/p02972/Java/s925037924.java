import java.util.*;
import java.lang.*;

import static java.lang.StrictMath.abs;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int list[] = new int[n];
        int sum[] = new int[n];
        int ans =0;
//        格納
        for(int l =0; l < n; l ++){
            list[l] = sc.nextInt();
            ans += list[l];
        }
//        各数字の倍数が書かれた箱に入ってるボールの個数の和
        for(int i=1; i<= n; i++){
            for(int k=1; i*k<= n; k++){
                sum[i-1] +=list[i*k-1];
            }
        }

        System.out.println(ans);
        if(ans != 0){
            for(int k =0; k < n;k++ ){
                if(sum[k] == 1){
                    System.out.println(k+1);
                }
            }
        }
    }
}