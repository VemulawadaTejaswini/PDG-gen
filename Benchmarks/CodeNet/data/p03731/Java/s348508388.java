import java.util.*;
 
public class Main{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        long T = sc.nextLong();
        long[] t = new long[N];
        for(int i = 0; i < N; i++){
            t[i] = sc.nextLong();
        }
        sc.close();

        long sum = T;
        long[] time = new long[N-1];
        for(int i = 0; i < N-1; i++){
            time[i] = t[i+1] - t[i];
        }
        for(int i = 0; i < N-1; i++){
            sum += Math.min(T, time[i]);
        }

        System.out.println(sum);
    }
}