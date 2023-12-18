import java.util.Scanner;
import java.math.BigDecimal;
import java.util.*;

public class Main{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        List<Edge> list = new ArrayList<>();
        // 出力しない辺を求める
        int start = 0;
        boolean flg = true;
        for(int i = 0; i < K; i++){
            start++;
            if(start == N + 1){
                flg = false;
                break;
            }
            int end = start + 2;
            if(end == N + 1){
                if(start <=  2){
                    flg = false;
                    break;
                }
                end = 1;
            }else if(end == N + 2){
                if(start <= 3){
                    flg = false;
                    break;
                }
                end = 2;
            }
            System.out.println(start + " " +  end);
            int starts = start;
            int ends = end;
            if(ends < starts){
                int tmp = starts;
                starts = ends;
                ends = tmp;
            }
            Edge e = new Edge(starts, ends);
            if(!list.contains(e)){
                list.add(e);
            }
        }
        if(!flg){
            System.out.println("-1");
        }else{
            int edgeMax = (N * (N - 1)) / 2;
            System.out.println(edgeMax - list.size());
            for(int i = 1; i < N; i++){
                for(int j = i + 1; j <= N; j++){
                    Edge e = new Edge(i, j);
                    if(!list.contains(e)){
                        System.out.println(i + " " + j);
                    }
                }
            }
        }
    }
    
    public static class Edge{
        private int u;
        private int v;
        public Edge(int u, int v){
            this.u = u;
            this.v = v;
        }
        public int getU(){
            return u;
        }
        public int getV(){
            return v;
        }
        @Override
        public boolean equals(Object obj){
            Edge e = (Edge)obj;
            if(e.getU() == this.u && e.getV() == this.v){
                return true;
            }
            return false;
        }
    }
}
