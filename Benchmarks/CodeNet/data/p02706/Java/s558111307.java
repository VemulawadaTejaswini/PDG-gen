import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());

        int[] A = new int[M];
        int sum=0;

        for(int i=0; i<M; i++){
            A[i] = Integer.parseInt(sc.next());
            sum += A[i];
        }

        if(sum > N){
            System.out.println(-1);
        }else{
            System.out.println(N - sum);
        }

    }
}