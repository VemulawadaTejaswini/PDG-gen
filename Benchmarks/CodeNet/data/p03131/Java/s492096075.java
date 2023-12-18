/*
* Author. Silviase(@silviasetitech)
* For AtCoder
*/

import java.util.*;
import java.lang.*;
import java.math.*;


public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        long k = sc.nextInt();
        long a = sc.nextInt();
        long b = sc.nextInt();
        if (a >= b - 2) {
            // just hit the pocket
            System.out.println(k+1);
        } else {
            // hit to a and always change(except last one)
            k -= a-1;
            // nokoru k times
            // k/2 times change and if odd +1
            if (k % 2 == 0) {
                System.out.println(a + (b-a)*(k/2));
            }else{
                System.out.println(a + (b-a)*(k/2)+1);
            }
        }


        sc.close();


    }
}