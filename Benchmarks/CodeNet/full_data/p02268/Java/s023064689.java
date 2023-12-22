import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.sql.Array;
import java.util.*;

public class Main {

    static long gcd (long a, long b) {return b>0?gcd(b,a%b):a;}
    static long lcm (long a, long b) {return a*b/gcd(a,b);}

    public static void main(String[] args){
	// write your code here
        Scanner sc=new Scanner(System.in);
        Set<Long> set = new HashSet<Long>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            long S=sc.nextLong();
            set.add(S);
        }
        long ans=0;
        int q=sc.nextInt();
        for(int i=0;i<q;i++){
            long T = sc.nextLong();
            if (set.contains(T)) {
                ans++;
            }
        }
        System.out.println(ans);

    }
}

