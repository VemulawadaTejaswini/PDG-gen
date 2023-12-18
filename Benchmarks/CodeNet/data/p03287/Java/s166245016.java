import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int M = scan.nextInt();
        int[] Array = new int[N];
        int[][] table = new int[N][N];
        int count = 0;
        for(int i = 0; i < N; i++){
            Array[i] = scan.nextInt() % M;
            table[i][i] = Array[i];
        }
        for(int i = N-1; i >= 0; i--){
            for(int k = i; k >= 0; k--){
                if(k != i)
                    table[k][i] = (Array[k] + table[k+1][i])%M;
                if(table[k][i] == 0)count++;
            }
        }
        System.out.println(count);
    }
}
