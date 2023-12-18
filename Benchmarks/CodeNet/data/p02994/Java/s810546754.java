import java.util.*;
import java.lang.*;

import static java.lang.StrictMath.abs;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int L = sc.nextInt();
        int[] ans = new int[d];
        int sum =0;
        for(int i =1; i <= d; i++){
            ans[i-1] = L + i -1;
        }
        //もとのアップルパイの味
        for(int j =0; j < d; j++){
            sum += ans[j];
        }
        //食べたあとのアップルパイの味
        if(L < 0&& abs(L) <= d){
            System.out.println(sum);
        }else if(L < 0 && abs(L)> d){
            System.out.println(sum + abs(ans[d-1]));
        }else if(L >= 0){
            System.out.println(sum - ans[0]);

        }

    }
}