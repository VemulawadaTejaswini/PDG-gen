import java.util.*;
 
public class Main{
    static int H, W, suc;
    static String[][] c;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[][] C = new int[3][N-1];
        for(int i = 0; i < N-1; i++){
            C[0][i] = sc.nextInt();
            C[1][i] = sc.nextInt();
            C[2][i] = sc.nextInt();
        }
        sc.close();

        int[] t = new int[N];
        t[N-1] = 0;
        for(int i = 0; i < N-1; i++){
            t[i] += (C[0][i] + C[1][i]);
            if(i != N-2){
                for(int j = i+1; j < N-1; j++){
                    if(t[i] <= C[1][j])
                        t[i] = C[1][j] + C[0][j];
                    else{
                        while(t[i] % C[2][j] != 0)
                            t[i]++;
                        t[i] += C[0][j];
                    }
                }
            }
        }
        for(int i = 0; i < N; i++){
            System.out.println(t[i]);
        }
    }
}