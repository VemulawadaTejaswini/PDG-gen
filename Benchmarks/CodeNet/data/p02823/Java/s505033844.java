import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long ans = 0;
        if((a+b)%2 == 1){
            long min1 = Math.min(a-1,b-1);
            long max1 = Math.max(a-1,b-1);
            long minN = Math.min(n-a,n-b);
            long maxN = Math.max(n-a,n-b);
            ans = Math.min(min1 + (max1 - min1)/2 + (max1 - min1)%2 ,minN + (maxN - minN)/2 + (maxN - minN)%2);
        }else{
            ans = Math.abs((a-b)/2);
        }
        System.out.println(ans);
    }
}

