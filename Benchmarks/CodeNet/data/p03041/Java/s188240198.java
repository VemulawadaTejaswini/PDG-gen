/*
* @Author Silviase(@silviasetitech)
* For ProCon
*/

import java.util.*;
import java.lang.*;
import java.math.*;

public class Main{    
    static int n;
    static int[] x = new int[n];
    static int[] y = new int[n];
    static int[] z = new int[n];
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int n = sc.nextInt();
        for (int i = 0; i < s.length(); i++) {
            if (i == n-1) {
                String a = s.substring(n-1, n);
                a = a.toLowerCase();
                System.out.print(a);
            }else{
                System.out.print(s.charAt(i));
            }
        }

        sc.close();
    }

}
