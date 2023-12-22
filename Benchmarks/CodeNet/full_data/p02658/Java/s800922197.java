import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.*;
import java.math.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n =Integer.parseInt(br.readLine());
        String in[] = br.readLine().trim().split(" ");
        long[]a = new long[n];
        for(int i=0;i<n;i++){
            a[i]= Long.parseLong(in[i]);
        }
        int t=0;
        long max = Long.MAX_VALUE;
        BigInteger mul = new BigInteger("1");
        int flag =0;
        for(int i=0;i<n;i++){
            mul = mul.multiply(BigInteger.valueOf(a[i]));
            t = mul.compareTo(new BigInteger("1000000000000000000"));
            if(t==1){
               flag =1;
            }
        }
        if((flag==1) && ! mul.equals(new BigInteger("0")) )
            System.out.println(-1);
        else
            System.out.println(mul);

        br.close();

    }
}