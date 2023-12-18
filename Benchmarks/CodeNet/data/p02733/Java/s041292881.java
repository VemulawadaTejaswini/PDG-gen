import java.util.*;
public class Main {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int W = scanner.nextInt();
        int K = scanner.nextInt();
        String[] S = new String[H];
        for (int i = 0; i < H; i++) {
            S[i] = scanner.next();
        }
        int ans = Integer.MAX_VALUE;
        for(int div=0; div<(1<<(H-1)); div++){
            int g = 0;
            int[] id = new int[H];
            for(int i=0; i<H; i++){
                id[i] = g;
                if(((div>>i)&1) == 1){
                    g++;
                }
            }
            g++;
            int[][] c = new int[g][W];
            for(int i=0; i<H; i++){
                for(int j=0; j<W; j++){
                    c[id[i]][j] += (S[i].charAt(j) - '0'); 
                }
            }
            
            int num = g-1;
            int[] now = new int[g];
            for(int i=0; i<W; i++){
                boolean isok = true;
                for(int j=0; j<g; j++){
                    if(now[j] + c[j][i] > K){
                        isok = false;
                    }
                }
                if(!isok){
                    num++;
                    now = new int[g];
                }
                for (int j = 0; j < g ; j++) {
                    now[j] += c[j][i];
                }
            }
            ans = Math.min(ans,num);
        }
        System.out.println(ans);
    }
}