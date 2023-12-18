import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        for(int i=1;i<=N;i+=2){
            int divisor = 0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    divisor++;
                }
            }
            if(divisor==8)
                count++;
        }
        System.out.println(count);
    }
}
