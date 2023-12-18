import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int Q = sc.nextInt();
        int[] group = new int[N];
        for ( int i = 0; i < N; i++ ){
            group[i] = 0;
        }
        for ( int j = 0; j < Q; j++ ){
            int A = sc.nextInt();
            group[A] = group[A] + 1;
        }
        for ( int i = 0; i < N; i++ ){
            if (group[i] > Q-K){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}