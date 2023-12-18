// 2019/07/13
// AtCoder Beginner Contest 055 - A

import java.util.*;
public class Main {
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
        // Input
        int n = sc.nextInt();
        int ans = 0;
        
        // Calc
        ans = n * 800 - (int)(n / 15) * 200;

        // Output
        System.out.println(ans);
    }
}