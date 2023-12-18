import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }
        int max = 0;
        for(int i = 0; i <= K; i++){
            int sum = 0;
            for(int j = 0; j < N; j++){
                int xor = i ^ A[j];
                sum += xor;
            }
            if(max < sum){
                max = sum;
            }
        }
        System.out.println(max);
    }
}