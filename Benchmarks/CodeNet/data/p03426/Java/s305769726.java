import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int H = sc.nextInt();
        int W = sc.nextInt();
        int D = sc.nextInt();
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        int[][] A = new int[H][W];
        for(int i = 0; i < H; i++){
            for(int j = 0; j < W; j++){
                A[i][j] = sc.nextInt();
                ArrayList<Integer> l = new ArrayList<>();
                l.add(i);
                l.add(j);
                map.put(A[i][j], l);
            }
        }
        int Q = sc.nextInt();
        int[][] L = new int[2][Q];
        for(int i = 0; i < Q; i++){
            L[0][i] = sc.nextInt();
            L[1][i] = sc.nextInt();
        }
        sc.close();

        int[] sum = new int[H*W+1];
        for(int i = 1; i < sum.length-D; i++){
            int dis = 0;
            int x1 = map.get(i).get(0);
            int y1 = map.get(i).get(1);
            int x2 = map.get(i+D).get(0);
            int y2 = map.get(i+D).get(1);
            dis += Math.abs(x1-x2)+Math.abs(y1-y2);
            sum[i+D] = sum[i] + dis;
        }
        for(int i = 0; i < Q; i++){
            System.out.println(sum[L[1][i]] - sum[L[0][i]]);
        }
    }
}