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
        
        int l = sc.nextInt();
        int[] ar = new int[l];
        for (int i = 0; i < l; i++) {
            int tmp = sc.nextInt();
            if (tmp == 0) {
                ar[i] = 0;
            }else if(tmp % 2 == 0){
                ar[i] = 2;
            }else{
                ar[i] = 1;
            }
        }
        for (int i = 0; i < l; i++) {
            if (ar[i] == 0) {
                ar[i] = 2;
            } else {
                break;
            }   
        }
        for (int i = 0; i < l; i++) {
            if (ar[l-1-i] == 0) {
                ar[l-1-i] = 2;
            }else{
               break; 
            }
        }
        int[] difar = new int[l];
        for (int i = 0; i < l; i++) {
            difar[i] = 2 - ar[i];
        }
        List<Integer> seqdif = new ArrayList<Integer>();
        int tmpp = 0;
        for (int i = 0; i < l; i++) {
            if (difar[i] == 0) {
                seqdif.add(tmpp);
                tmpp = 0;
            } else {
                tmpp += difar[i];
            }
        }
        seqdif.add(tmpp);

        Collections.sort(seqdif);
        int sum = 0;
        for (int i = 0; i < seqdif.size()-1; i++) {
            sum += seqdif.get(i);
        }
        System.out.println(sum);

        sc.close();


    }
}