import java.util.*;
import java.io.*;
public class Main {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream pr = System.out;
        PrintWriter out = new PrintWriter(pr);
        int n = sc.nextInt();
        double d =0.0;
        for(int i=0;i<n;i++){
            double val = sc.nextDouble();
            double ans = 1/val;
            d+=ans;
        }
        d=1/d;
        out.print(d);
        out.close();
    }
    public static long gcd(long a,long b){
        if(a==0){
            return b;
        }else{
            return gcd(b%a,a);
        }
    }
}