import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int K = sc.nextInt();
        int max = Math.max(A,Math.max(B,C));
        int sum = 0;
        if(max > A){
            sum += A;
        }
        if(max > B){
            sum += B;
        }
        if(max > C){
            sum += C;
        }
        for(int i = 0;i < K;i++){
            max *= 2;
        }
        sum += max;
        System.out.println(sum);
    }
}
