import java.io.*;
import java.lang.*;
import java.util.*;
public class Main{  
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] str=br.readLine().split(" ");
        long N=Integer.parseInt(str[0]);
        long K=Integer.parseInt(str[1]);
        long M=1000000007;
        long count=0;
        for(long i=K;i<=N+1;i++){
            count=(count+(i*(N-i+1)+1))%M;
        }
        System.out.println(count);
    }
}
