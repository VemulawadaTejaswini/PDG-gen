import java.io.*;
import java.lang.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] str=br.readLine().split(" ");
        long N=Long.parseLong(str[0]);
        long K=Long.parseLong(str[1]);
        long ans=0;
        if(N%K==0) ans=0;
        else if(N<K) ans=Math.min(K-N,N);
        else{
            while(N>=K) N-=K;
            ans=Math.min(K-N,N);
        }
        System.out.println(ans);
    }
}
