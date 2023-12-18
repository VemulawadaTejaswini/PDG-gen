import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String[] ips = br.readLine().split(" ");
        int len = ips.length;
        int[] cnta = new int[100005];
        int[] cntb = new int[100005];
        int mxa = -1;
        int mxb = -1;
        int besta = -1;
        int bestb = -1;
        for(int i = 0; i < len; i+=2){
            int curr = Integer.parseInt(ips[i]);
            cnta[curr]++;
            if(cnta[curr] > mxa){
                mxa = cnta[curr];
                besta = curr;
            }
        }
        for(int i = 1; i < len; i+=2){
            int curr = Integer.parseInt(ips[i]);
            cntb[curr]++;
            if(cntb[curr] > mxb){
                mxb = cntb[curr];
                bestb = curr;
            }
        }
        
        int res = len - mxa - mxb;
        if(mxa==mxb && mxa==len/2 && besta == bestb)
            res += mxa;
        System.out.println(res);
    }
}