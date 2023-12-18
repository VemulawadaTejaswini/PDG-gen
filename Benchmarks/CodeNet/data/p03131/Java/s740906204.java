//package atcoder.yahoo;

import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long k = s.nextLong();
        long a = s.nextLong();
        long b = s.nextLong();

        if(a > b) {
            System.out.println(k+1);
        } else {
            if(k < a - 3){
                System.out.println(k+1);
            } else {
                long a1 = k + 1;
                long totalBis = a;
                k = k - a + 1;

                while(k > 1) {
                    totalBis += b - a;
                    k -= 2;
                }
                if(k == 1) {
                    totalBis++;
                }
                System.out.println(Math.max(totalBis, a1));
            }
        }
//        System.out.println(func(k,a,b,1,0));
    }



    private static int func(int k, int a, int b, int currBis, int currY) {
        if(k == 1) {
            int ans = currBis;
            if(currY >= 1){
                ans += b;
            }else {
                ans +=1;
            }
            return ans;
        }


        if(currBis < a) {
            if(currY > 0) {
                int a1 = func(k-1, a, b, currBis + 1, currY);
                int a2 = func(k - 1, a, b, currBis + b, currY - 1);
                return Math.max(a1, a2);
            } else {
                int a1 = func(k-1, a, b, currBis + 1, currY);
                return a1;
            }
        } else {
            if(currY > 0) {
                int a1 = func(k-1, a, b, currBis + 1, currY);
                int a2 = func(k - 1, a, b, currBis + b, currY - 1);
                int a3 = func(k - 1, a, b, currBis - a, currY + 1);
                return Math.max(a1, Math.max(a2, a3));
            } else {
                int a1 = func(k-1, a, b, currBis + 1, currY);
//                int a2 = func(k - 1, a, b, currBis + b, currY - 1);
                int a3 = func(k - 1, a, b, currBis - a, currY + 1);
                return Math.max(a1, a3);
            }
        }
    }
}
