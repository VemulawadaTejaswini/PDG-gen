import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long m = sc.nextLong();
        int[] a = new int[n];
        for(int i = 0;i<n;i++){
            a[i] = (sc.nextInt() / 2);
            if(a[i] % 2 == 0){System.out.println(0);return;}
        }
        Arrays.sort(a);
        long result = a[0];
        for(int i = 1;i<n;i++){
            result = (result * (long)a[i]) / gcd(result,(long)a[i]);
        }
        long num = 1;
        if(result>m){System.out.println(0);}
        else{
            m -= result;
            num += ((m/result)/2);
            System.out.println(num);
        }
        sc.close();
    }

    static long gcd (long x,long y) {return y>0?gcd(y,x%y):x;}

}