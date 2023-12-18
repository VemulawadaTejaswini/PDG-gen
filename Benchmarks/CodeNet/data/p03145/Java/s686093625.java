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
        
        int[] ar = new int[3];
        for (int i = 0; i < 3; i++) {
            ar[i] = sc.nextInt();
        }
        Arrays.sort(ar);
        System.out.println(ar[0]*ar[1]/2);
        sc.close();
    }
}