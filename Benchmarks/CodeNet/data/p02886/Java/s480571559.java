import java.math.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.io.*;

public class Main {


    public static long f(long n){
        if(n==1) return 1;
        return n*f(n-1);
    }

    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int res = 0;
        int p = 0;
        for(int i=0;i<n;i++) {
            int b = scan.nextInt();
            res -= b*b;
            p += b;

        }

        res += p*p;

        System.out.print(res/2);




    }

    
}
