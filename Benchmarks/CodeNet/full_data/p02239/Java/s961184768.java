import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner; 

public class Main {
    private static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int V = sc.nextInt();
        boolean E [][] = new boolean [V+1][V+1];
        
        for (int i=1; i<V+1; i++){
            int v = sc.nextInt();
            int k = sc.nextInt();
            for (int j=0; j<k; j++){
                int vk = sc.nextInt();
                E [v][vk] = true;
            }
        }
        Queue <Integer> Q = new ArrayDeque <Integer>();
        Q.add(1);
        
        int D [] = new int [V+1];
        D [1] = 1;
        
        while (Q.size()>0){
            int cur = Q.poll();
            for (int dst=1; dst<V+1; dst++){
                if (E[cur][dst] == true & D[dst] == 0){
                    D[dst]=D[cur]+1;
                    Q.add(dst);
                }           
            }           
        }
        for (int m=1; m<V+1; m++){
            System.out.println(m+" "+(D[m]-1));
        }
    }
}
