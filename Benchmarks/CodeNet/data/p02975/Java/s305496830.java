import java.util.*;
import java.lang.*;

import static java.lang.StrictMath.abs;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        //格納
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
//全部０ならYes,nが3の倍数で2/3個が１ならYes
        long sum=0;
        //入力の中でなんこ１か
        for(int k=0; k< n ; k++){
         sum += a[k] % 2;
        }
        //出力
        if((n%3 ==0 && sum==(n*2/3))|| sum==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }


    }
}
