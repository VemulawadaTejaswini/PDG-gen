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
        
        int n = sc.nextInt();
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a.charAt(i) == b.charAt(i) && b.charAt(i) == c.charAt(i)) {
                continue;
            }else if(a.charAt(i) != b.charAt(i) && b.charAt(i) != c.charAt(i)
                                && c.charAt(i) != a.charAt(i)){
                count += 2;
            }else{
                count++;
            }
        }
        System.out.println(count);

        sc.close();

    }

    public static void intArrayScan(int[] array) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        sc.close();
    }

    public static void longArrayScan(long[] array, int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextLong();
        }
        sc.close();
    }

    public static void intArrayPrint(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void intSquareArrayScan(int[][] array, int h, int w) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }

    public static void intArrayListScan(List<Integer> list, int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        sc.close();
    }

    public static void intArrayListPrint(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));  
        }
    }
}