import java.util.*;
import java.io.*;

class Main {
    static int searchP(long p,int[] ws){
        int count = 1;
        int sum = 0; 
        for(int i = 0; i < ws.length; i++){
            if(sum + ws[i] <= p) {
            sum += ws[i];
            } else {
                count++;
                if(ws[i] <= p){
                sum = ws[i];
                } else{
                    count += 99999;
                }
            }
        }
        return count;
    }
    static long solve(long p, int[] ws, long k){
        long right = p;
        long left = 0;
        long mid;
        while(right - left > 1) {
            mid = (left + right) / 2;
            int v = searchP(mid,ws);
            if(k >= v) {
                right = mid;
            } else {
               left = mid;
                
            }
        }
    return right;
    }
    public static void main(String...args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] info = br.readLine().split(" ");
        int n = Integer.parseInt(info[0]);
        int k = Integer.parseInt(info[1]);
        int[] ws = new int[n];
        for(int i = 0; i < n; i++) {
            ws[i] = Integer.parseInt(br.readLine());
        }
        long p = 100000 * 10000;
        System.out.println(solve(p,ws,k));
        
    }
}



