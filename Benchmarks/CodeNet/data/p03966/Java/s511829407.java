import java.util.*;

public class Main{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[][] T = new int[2][N];
        for(int i = 0; i < N; i++){
            T[0][i] = sc.nextInt();
            T[1][i] = sc.nextInt();
        }
        sc.close();

        long numT = 1;
        long numA = 1;

        for(int i = 0; i < N; i++){
            long t, a;
            if(numT%T[0][i] == 0)
                t = numT/T[0][i];
            else
                t = numT/T[0][i]+1;
            if(numT%T[1][i] == 0)
                a = numA/T[1][i];
            else
                a = numA/T[1][i]+1;
            long min = Math.max(t, a);
            numT = min*T[0][i];
            numA = min*T[1][i];
        }

        System.out.println(numT+numA);
    }
}