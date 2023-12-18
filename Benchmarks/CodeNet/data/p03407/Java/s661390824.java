// 2019/06/28
// AtCoder Beginner Contest 091 - A

import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Input
       int a = sc.nextInt();
       int b = sc.nextInt();
       int c = sc.nextInt();

        // Make string
       String ans;
       if(a + b >= c){
           ans = "Yes";
       } else {
           ans = "No";
       }
       
       // Output
       System.out.println(ans);
    }
}