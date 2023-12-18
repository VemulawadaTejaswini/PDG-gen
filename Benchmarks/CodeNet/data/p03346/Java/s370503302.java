import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] P = new int[N];
        for(int i = 0; i < N; i++)
            P[i] = sc.nextInt();

        sc.close();

        int idx = 1;
        int max = 0;
        int count = 1;
        int a = P[0];
        while(idx < N){
            if(P[idx] < a){
                idx++;
            } else if(P[idx] == a+1){
                count++;
                a = P[idx];
                idx++;
            } else if(P[idx] > a+1){
                max = Math.max(max, count);
                a = P[idx];
                idx++;
                count = 1;
            }
        }
        max = Math.max(max, count);
        System.out.println(N-max);
    }
}