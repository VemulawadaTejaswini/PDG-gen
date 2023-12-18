import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String HWD = br.readLine();
        int H = Integer.parseInt(HWD.split(" ")[0]);
        int W = Integer.parseInt(HWD.split(" ")[1]);
        int D = Integer.parseInt(HWD.split(" ")[2]);
     
        int[] Hei = new int[H*W+1];
        int[] Wid = new int[H*W+1];
        
        for(int i = 0; i < H; i++){
            String[] line = br.readLine().split(" ");
            for(int j = 0; j < W; j++){
                int temp = Integer.parseInt(line[j]);
                Hei[temp] = i;
                Wid[temp] = j;
            }
        }
        
        int Q = Integer.parseInt(br.readLine());
        while(Q-- > 0){
            String str = br.readLine();
            int start = Integer.parseInt(str.split(" ")[0]);
            int end = Integer.parseInt(str.split(" ")[1]);
            
            System.out.println(cost(Hei,Wid,start,end,D));
        }
    }

    static int cost(int[] Hei, int[] Wid, int cur, int end, int add){
        int ans = 0;
        while(cur < end){
            ans += Math.abs(Hei[cur] - Hei[cur+add]) + Math.abs(Wid[cur] - Wid[cur+add]);
            cur += add;
        }
        
        return ans;
    }
}
