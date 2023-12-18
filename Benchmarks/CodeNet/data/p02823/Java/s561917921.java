import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = 0;
        if((a+b)%2 == 1){
            ans = Math.min(Math.max(a-1,b-1),Math.max(n-a,n-b));
        }else{
            ans = Math.abs((a-b)/2);
        }
        System.out.println(ans);
    }
}

