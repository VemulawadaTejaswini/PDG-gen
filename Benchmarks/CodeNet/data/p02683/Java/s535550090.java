import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());
        int X = Integer.parseInt(sc.next());

        int[] C = new int[N];
        int[] A = new int[M];

        int[][] CA = new int[N][M];

        int ans = 0;

        for(int i = 0; i < N; i++){
            C[i] = Integer.parseInt(sc.next());
            for(int j = 0; j < M; j++){
                CA[i][j] = Integer.parseInt(sc.next());
            }
        }

        boolean judge = true;
        for(int i = 0; i < N-1; i++){
            C[i + 1] += C[i];
            ans = C[i + 1];

            for(int j = 0; j < M; j++){
                CA[i + 1][j] += CA[i][j];
                if(CA[i + 1][j] < 10)
                    judge = false;
            }
            
            if(judge)
                break;
            if(!judge)
                continue;
        }

        if(judge)
            System.out.println(ans);
        if(!judge)
            System.out.println(-1);
    }
}