import java.util.*;
 
public class Main{
    static int N;
    static int[][] x;
    static int cx;
    static int cy;
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in); 
       
        N = sc.nextInt();
        x = new int[3][N];
       for(int i = 0; i < N; i++){
           x[0][i] = sc.nextInt();
           x[1][i] = sc.nextInt();
           x[2][i] = sc.nextInt();
       }
       sc.close();

       for(int i = 0; i <= 100; i++){
            loop: for(int j = 0; j <= 100; j++){
                cx = i;
                cy = j;
                int H = decide_h();
                for(int k = 0; k < N; k++){
                    if(Math.max(H - Math.abs(x[0][k] - cx) - Math.abs(x[1][k] - cy), 0) != x[2][k]){
                        continue loop;
                    }
                    if(k == N-1){
                        System.out.println(cx + " " + cy + " " + H);
                        break;
                    }
                }
            }
       }
    }
    static int decide_h(){
        for(int l = 0; l < N; l++){
            if(x[2][l] > 0){
                return x[2][l] + Math.abs(x[0][l] - cx) + Math.abs(x[1][l] - cy);
            }
        }

        return 0;
    }
}