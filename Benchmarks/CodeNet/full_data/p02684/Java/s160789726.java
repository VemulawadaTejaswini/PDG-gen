import java.util.*;


import java.io.*;

public class Main {
    
    static long solve(int[] cost, int[][] points, int[] bucket, int x, int book){
        
        if(book >= cost.length){
            for(int i = 0; i < bucket.length; i++){
                if(bucket[i] < x){
                    return Long.MAX_VALUE;
                }
               
            }
            return 0;
        }
            
      
        long ans =  Long.MAX_VALUE;
        // leave current book
        long small = solve(cost, points, bucket, x, book+1);
        if(small != Long.MAX_VALUE)
            ans= Math.min(ans,small);
        
        int[] copy = bucket.clone();
        for(int i = 0; i < bucket.length; i++){
            copy[i] += points[book][i]; 
        }

     small = solve(cost, points, copy, x, book+1);
        if(small != Long.MAX_VALUE){
            ans = Math.min(ans,cost[book] + small); 
    
        }
        
        return ans;
    }
    

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().trim().split(" ");
        int n = Integer.parseInt(in[0]);
        long k = Long.parseLong(in[1]);
        
        StringTokenizer token = new StringTokenizer(br.readLine().trim()," ");
        HashMap<Integer,Integer> hm = new HashMap<>();
        int i = 1;
        while(token.hasMoreTokens()){
            hm.put(i++,Integer.parseInt(token.nextToken()));
            
        }

        int town = 1;
        while(k > 0){
            town =  hm.get(town);
            k--;
        }

        System.out.println(town);
 
        

    }
}