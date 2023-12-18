import java.io.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long n = Long.parseLong(br.readLine());
        long res = 1 + (n>2?1:0);
        for(long i = 2;i*i <= n; ++i){
            long t = n;
            long mod = t%i;
            if(mod==0){
                while(t%i==0){
                    t/=i;
                }
                if(t==1 || t%i==1)
                    res++;
            }
            else if(mod==1) {
                res += 1 + (i*i==n?0:1);
            }
        }
        System.out.println(res);
        
    }
}