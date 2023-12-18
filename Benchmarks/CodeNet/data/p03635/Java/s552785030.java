// 2019/06/26
// AtCoder Beginner Contest 069 - A

import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Input
        int n = sc.nextInt();
        int m = sc.nextInt();

        // Calc
       int ans = (n-1) * (m-1);
       // Output
       System.out.println(ans);
    }
}