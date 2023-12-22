import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int K = input.nextInt();
        int[] A = new int[N+1];
        for(int i=1;i<N+1;i++)
            A[i] = input.nextInt();

        //start
        int res = 1;
        for(int i=0;i<K;i++){
            res = A[res];
        }

        System.out.println(res);
    }
}
