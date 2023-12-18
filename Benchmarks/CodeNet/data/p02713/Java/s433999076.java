import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        int k = Integer.parseInt(f.readLine());
        long sum = 0;
        for(int i = 1; i <= k; i++){
            for(int j = 1; j <= k; j++){
                for(int jj = 1; jj <= k; jj++){
                    sum+=gcd(gcd(i, j), jj);
                }
            }
        }
        out.println(sum);
        out.close();
    }

    public static long gcd(long a, long b){
        while(b != 0){
            long t = b;
            b = a%b;
            a = t;
        }
        return a;
    }
}
