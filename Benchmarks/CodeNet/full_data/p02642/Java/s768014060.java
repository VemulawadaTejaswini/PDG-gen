import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();   // 長さ
        int A[] = new int[N];
        for(int i=0; i<N; i++)
            A[i] = in.nextInt();
        int count = N;

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if( i != j  && A[i] % A[j] == 0){
                    count--;
                    break;
                }
            }
        }

        System.out.println(count);
    }
}