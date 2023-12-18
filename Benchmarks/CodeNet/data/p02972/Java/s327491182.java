import java.util.*;
import java.lang.*;

import static java.lang.StrictMath.abs;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int list[] = new int[n];
        int sum[] = new int[n];
//        格納
        for(int l =0; l < n; l ++){
            list[l] = sc.nextInt();
        }
//        各数字の倍数が書かれた箱に入ってるボールの個数の和
        for(int i=0; i< (n+1)/2; i++){
            for(int k=i; k< n; k++){
                if(k % (i+1) == 0){
                    sum[i] +=list[k];
                }
            }
        }
        for(int y =(n+1)/2; y<n; y++){
            sum[y] = list[y];
        }
        int ans =0;
//
        for(int j=0; j<n; j++){
            ans += list[j];
        }

        System.out.println(ans);
        if(ans!=0){
            for(int k =0; k < n;k++ ){
                if(sum[k]==1){
                    System.out.println(k+1);
                }
            }
        }
    }
}