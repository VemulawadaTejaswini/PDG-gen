import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int L = scanner.nextInt();
        Map<Integer, Map<Integer,Long>> dist = new HashMap<>();
        for(int i=1; i<=N; i++){
            dist.put(i, new HashMap<>());
            for(int j=1; j<=N; j++){
                if( i==j ){
                    dist.get(i).put(j,Long.valueOf(0));
                }else{
                    dist.get(i).put(j, Long.MAX_VALUE/2);
                }
            }
        }
        for(int i=1; i<=M; i++){
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int C = scanner.nextInt();
            dist.get(A).put(B,Long.valueOf(C));
            dist.get(B).put(A,Long.valueOf(C));
        }
        int Q = scanner.nextInt();
        List<Integer> S = new ArrayList<>();
        List<Integer> T = new ArrayList<>();
        for(int i=0; i<Q; i++){
            S.add(scanner.nextInt());
            T.add(scanner.nextInt());
        }
        // initialize
        // Map<Integer, Map<Integer, Long>> length = new HashMap<>();
        // for(int i=1; i<=N; i++){
        //     length.put(i, new HashMap<>());
        //     for(int j=1; j<=N; j++){
        //         if( i==j ){
        //             length.get(i).put(j, Long.valueOf(0));
        //         }else if(dist.containsKey(i) && dist.get(i).containsKey(j)){
        //             length.get(i).put(j, Long.valueOf(dist.get(i).get(j)));
        //         }else{
        //             length.get(i).put(j, Long.MAX_VALUE/2);
        //         }
        //     }
        // }
        //System.out.println(length);
        // 3 layer for statement
        for(int i=1; i<=N; i++){
            for(int j=1; j<=N; j++){
                for(int k=1; k<=N; k++){
                    Long cand = dist.get(j).get(i) + dist.get(i).get(k);
                    //System.out.println(String.format("%d,%d,%d,%d",cand,length.get(j).get(i),length.get(i).get(k),length.get(j).get(k)));
                    if(dist.get(j).get(k) > cand){
                        dist.get(j).put(k, cand);
                    }
                }
            }
        }
        //System.out.println(length);
        Map<Integer, Map<Integer, Integer>> cost = new HashMap<>();
        for(int i=1; i<=N; i++){
            cost.put(i, new HashMap<>());
            for(int j=1; j<=N; j++){
                if(i==j){
                    cost.get(i).put(j,0);
                }else if(dist.get(i).get(j) <= L){
                    cost.get(i).put(j,1);
                }else{
                    cost.get(i).put(j,99999);
                }
            }
        }
        //System.out.println(cost);
        for(int i=1; i<=N; i++){
            for(int j=1; j<=N; j++){
                for(int k=1; k<=N; k++){
                    int cand = cost.get(j).get(i)+cost.get(i).get(k);
                    if(cost.get(j).get(k) > cand){
                        cost.get(j).put(k, cand);
                    }
                }
            }
        }
        //System.out.println(cost);
        for(int i=0; i<Q; i++){
            int ans = cost.get(S.get(i)).get(T.get(i));
            if(ans == 99999){
                System.out.println(-1);
            }else{
                System.out.println(ans - 1);
            }
        }
    }
}