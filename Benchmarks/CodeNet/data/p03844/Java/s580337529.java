// 2019/07/08
// AtCoder Beginner Contest 050 - A

import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Input
        int a = sc.nextInt();
        String o = sc.next();
        int b = sc.nextInt();
        int ans;

        // Check
       if(o.equals("+")){
           ans = a + b;
       } else {
           ans = a - b;
       }
       
       // Output
       System.out.println(ans);
    }
}