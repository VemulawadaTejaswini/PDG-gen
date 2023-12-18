import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] x = new int[N];
        int k = 1;
        for(int i = 0; i < N; i++){
            x[i] = sc.nextInt();
        }
        int e = x[N-1];
        for(int i = N-1; i >= 1; i--){
            e += (x[i]-x[i-1]) * (k+1)*(k+1);
            k ++;
        }
        e += x[0] * (k+1)*(k+1);
        e += X * (N+1);
        System.out.println(e);
    }
}
