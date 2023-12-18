import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N  =scan.nextInt();
        int K = scan.nextInt();
        int Q = scan.nextInt();
        int[] A = new int[N];
        for(int i=0;i<N;++i)A[i]=scan.nextInt();
        Arrays.sort(A);
        System.out.println(A[Q-1]-A[0]);

    }
}