import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();   // N学期制
        int K = in.nextInt();   // 直近K回の期末テスト
        int A[] = new int[N];
        for(int i=0; i<N; i++)
            A[i] = in.nextInt();
        int X = 1;
        int Y = 1;
        
        for(int i=0; i<N-K+1; i++){
            for(int j=0; j<K; j++){
                X*=A[K-1+i-j];
            }
            if( i > 0 ){
                if( X > Y ){
                    System.out.println("Yes");
                }else {
                    System.out.println("No");
                }
            }
            Y = X;
            X = 1;
        }
    }
}