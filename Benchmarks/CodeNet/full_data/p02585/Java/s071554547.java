import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scan = new Scanner(System.in);
        
        String[] str = scan.nextLine().split(" ");
        int N = Integer.parseInt(str[0]);
        long K = Long.parseLong(str[1]);
        
        int[] P = Stream.of(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < P.length; i++){
            P[i]--;
        }
        
        long[] C = Stream.of(scan.nextLine().split(" ")).mapToLong(Long::parseLong).toArray();

        scan.close();
        
        
        List<Boolean> dp = Arrays.asList(new Boolean[N]);
        
        List<List<Integer>> graph = new ArrayList<List<Integer>>();
        int idx = 0;
        
        int init;
        List<Integer> route;
        
        while(idx != -1){
            init = idx;
            route = new ArrayList<Integer>();
            
            while(true){
                dp.set(idx, true);
                route.add(idx);
                idx = P[idx];
                if (idx == init){
                    break;
                }
            }
            graph.add(route);
            idx = dp.indexOf(null);
        }
        
        //System.out.println(graph);
        
        long ans = (long) Double.NEGATIVE_INFINITY;
        
        int d;
        List<Long> scores;
        List<Long> scoresLooped;
        long score;
        int r;
        long summation;
        for(int i = 0; i < graph.size(); i++){
            d = graph.get(i).size();
            
            scores = new ArrayList<Long>();
            scoresLooped = new ArrayList<Long>();
            for(int j = 0; j < d; j++){
                scores.add(C[graph.get(i).get(j)]);
                scoresLooped.add(C[graph.get(i).get(j)]);
            }
            for(int j = 0; j < d; j++){
                scoresLooped.add(C[graph.get(i).get(j)]);
            }

            //System.out.println(scores);
            //System.out.println(scoresLooped);
            
            score = 0;
            r = (int) ((K - 1) % d) + 1;
            
            for(int j = 0; j < scores.size(); j++){
                for(int k = 1; k < r + 1; k++){
                    score = 0;
                    for(int l = j; l < j + k; l++){
                        score += scoresLooped.get(l);
                    }
                    //System.out.println(score);
                    if(score > ans){
                        ans = score;
                    } 
                }
            }
            
            summation = 0;
            for(int j = 0; j < scores.size(); j++){
                summation += scores.get(j);
            }
            if(summation > 0){
                if(K > d){
                    ans += summation*(K/d);
                }
            }
            
        }
        System.out.println(ans);
    }
}