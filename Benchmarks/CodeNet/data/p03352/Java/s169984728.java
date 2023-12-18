
import java.util.*;
import java.lang.*;

import static java.lang.StrictMath.abs;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        double[] ans = new double[331];
        ans[0] = 0;
        double a = 0;
        double b =0;

       for(double i =1; i< 33; i++){
           for(double k = 2; k < 10; k++){
               a = Math.pow(i,k);
               if(a<=x&& x-a < x- b){
                   b =a;
  
               }
           }

       }
        System.out.println((int)b);



        }

    }