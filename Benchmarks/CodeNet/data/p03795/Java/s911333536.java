import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
    public static void main (String[] args) throws java.lang.Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        long N = Long.parseLong(line);
        long ans = 1;
        for(long i=1;i<=N;i++){
            ans *= i;
            ans%=(long)Math.pow(10,9)+7;
        }
        System.out.println(ans);
    }
}