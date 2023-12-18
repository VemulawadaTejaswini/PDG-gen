import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int K = scan.nextInt();
        int[] A = IntStream.range(0,K).map(i -> scan.nextInt()).toArray();

        int left=2;
        int right=2;
        for(int i=K-1;i>=0;--i){
            left = A[i]*((left-1)/A[i] + 1);
            right=A[i]*(right/A[i]) + (A[i]-1);
        }
        if(left>right){
            System.out.println(-1);
        }else{
            System.out.println(left+" "+right);
        }

    }
}