// This file is a "Hello, world!" in Java language by OpenJDK for wandbox.

import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;//循環変数
        int max1=0;//本来の最大値
        int maxIndex= 0;//本来の最大値のインデックス
        int min1=0;//本来の最小値
        int minIndex=0;//本来の最小値のインデックス
        int max2=0;//min1のインデックスよりも前のインデックスにある最大値
        int min2=0;//max1のインデックスよりも後のインデックスにある最小値
        int[] money = new int[n];
        for (i = 0; i < n; i++) {
            money[i] = sc.nextInt();
        }
         max1 = money[0];
            min1 = money[0];
        for (i = 0; i < n; i++) {
           
            if (money[i] >= max1) {
                max1 = money[i];
                maxIndex = i;
            }
            if (money[i] < min1){
                min1 = money[i];
                minIndex = i;
            }
        }
        
    
 min2 = money[maxIndex];
        for (i = maxIndex; i >= 0; i --) {
           
            if (money[i] < min2) {
                min2 = money[i];
            }
        }
        
                    max2 = money[minIndex];
        for (i = minIndex; i < n; i++) {

            if (money[i] > max2) {
                max2 = money[i];
            }
        }

        int ans1 = max1 - min2;
        int ans2 = max2 - min1;

        if (ans1 > ans2) {
            System.out.println(ans1);
        } else {
          System.out.println(ans2);
        }








    }

}

// OpenJDK reference:
//   http://openjdk.java.net/

// Java language references:
//   http://docs.oracle.com/javase

