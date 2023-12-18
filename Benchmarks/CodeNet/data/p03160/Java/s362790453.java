import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        //Dummy input (for Debug)
        int n_d = 7;
        int[] h_d = {2,9,4,5,1,6,10};
        
        //Get Input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n_in = br.readLine();
        String h_in = br.readLine();

        int n = Integer.parseInt(n_in);

        String[] s = h_in.split(" ");
        int[] h = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            h[i] = Integer.parseInt(s[i]);
        }
        
        //Set and Run
        DPRunner dpr = new DPRunner();
        dpr.setInput(n,h);
        int result = dpr.runDP();
        // dpr.print();    //deb

        //Output
        System.out.println(result);
    }
    
    static class DPRunner {
        private int n;
        private int[] h;
        int[] minCosts;
        
        
        void setInput(int n, int[] h){
            this.n = n;
            this.h = h;
            this.minCosts =  new int[h.length];
        }
        
        //ノードごとの最小コストを探索。最後のノードへの最小コストを返却
        int runDP(){
            //Member Initialization Check
            if(n == 0 || n != h.length)
                throw new RuntimeException();
            
            
            for(int i = 0; i < n; i++){
                minCosts[i] = calcNode(i);
            }
            return minCosts[n-1];
        }
        
        private int calcNode(int node){
            //まずノード1。コストは無い
            // minCosts[0] = 0;
            if(node == 0) {
                return 0;
            }
            
            
            //minCosts[1] = Math.abs(h[0] - h[1]);
            if(node == 1) {
                int cost1 = Math.abs(h[0] - h[1]);
                return cost1;
            }
            
            //1マスjump
            int cost1 = minCosts[node - 1] + Math.abs(h[node - 1] - h[node]);
            //ノード2は1マスjumpのみ許容
            if(node == 1) {
                return cost1;
            }
            //2マスjump
            int cost2 = minCosts[node - 2] + Math.abs(h[node - 2] - h[node]);
            return (cost1 < cost2) ? cost1 : cost2;
        }
        
        void print(){
            System.out.println("n:" + n + ", h:" + Arrays.toString(h));
            System.out.println("minCosts:" + Arrays.toString(minCosts));
        }
    }
}