import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int M;
        if(N > K){
            M = K * X + (N - k) * Y;
            System.out.println(M);
        }else if(N < K){
            M = N * X;
            System.out.println(M);
        }
    }
}