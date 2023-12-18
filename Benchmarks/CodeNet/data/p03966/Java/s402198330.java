import java.util.*;

public class Main{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[][] T = new int[3][N];
        for(int i = 0; i < N; i++){
            T[0][i] = sc.nextInt();
            T[1][i] = sc.nextInt();
            T[2][i] = T[0][i] + T[1][i];
        }
        sc.close();

        long numT = T[0][0];
        long numA = T[1][0];

        for(int i = 1; i < N; i++){
            long min = Math.max((long)Math.ceil((double)numT/T[0][i]), (long)Math.ceil((double)numA/T[1][i]));
            numT = min*T[0][i];
            numA = min*T[1][i];
        }

        System.out.println(numT+numA);
    }
}