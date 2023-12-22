// package Contest#176;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        StringTokenizer st1 = new StringTokenizer(br.readLine());

        long sum = 0;
        int max = Integer.MIN_VALUE;

        for(int i=1; i<=n; i++){
            int ht = Integer.parseInt(st1.nextToken());
            max = Math.max(max, ht);
            if(ht < max){
                sum += (max-ht);
            }
        }

        out.println(sum);
        out.close();
    }
}