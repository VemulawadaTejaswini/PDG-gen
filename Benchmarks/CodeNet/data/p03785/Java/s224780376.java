import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
    public static void main (String[] args) throws java.lang.Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] lines = br.readLine().split(" ");
        int N = Integer.parseInt(lines[0]);
        int C = Integer.parseInt(lines[1]);
        int K = Integer.parseInt(lines[2]);
        
        ArrayList<Integer> ppl = new ArrayList<Integer>();
        for(int i=0;i<N;i++){
            ppl.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(ppl);
        
        int ans = 0;
        Bus nowBus = new Bus();
        for(int p:ppl){
            if(nowBus.end < p || nowBus.pplcnt==C){
                nowBus = new Bus();
                nowBus.end = p+K;
                nowBus.pplcnt = 0;
                ans++;
            }
            nowBus.pplcnt++;
        }
        
        System.out.println(ans);
    }
    private static class Bus{
        public int end = 0;
        public int pplcnt = 0;
        
    }
}