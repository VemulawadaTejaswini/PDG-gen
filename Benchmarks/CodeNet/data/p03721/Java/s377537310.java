import java.lang.*;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        
        String[] nk = br.readLine().split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);
        long[] arr = new long[100001];
        
        for(int i = 0; i < n; i++){
            String[] vq = br.readLine().split(" ");
            int v = Integer.parseInt(vq[0]);
            int q = Integer.parseInt(vq[1]);
            arr[v] += q;
        }
        
        long sum = 0;
        
        for(int i = 1; i < 100001; i++){
            sum += arr[i];
            if(sum >= k){
                System.out.println(i);
                break;
            }
        }

    }
}
