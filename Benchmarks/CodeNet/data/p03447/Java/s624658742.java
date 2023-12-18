// 2019/07/10
// AtCoder Beginner Contest 087 - A

import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Input
        int x = sc.nextInt();
        int a = sc.next();
        int b = sc.nextInt();
        int ans;

        // Calc
       ans = (x - a) % b;
       
       // Output
       System.out.println(ans);
    }
}