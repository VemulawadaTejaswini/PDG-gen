import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long K = sc.nextLong();
        long[] A = new long[(int)N];
        /*if(N < 2147483647){
        else{
        long[] A = new long[(int)2147483647];    
        }*/
        
        long min = N;
        A[0] = N - K;
        A[0] = Math.abs(A[0]);
        //System.out.print(A[0]);
        
        for(int i = 1; i < N ;i++){
        A[i] = A[i-1] - K;
        A[i] = Math.abs(A[i]);
        //System.out.println(A[i]);
        if(min > A[i]){
            min = A[i];
        }
        }
        
        System.out.print(min);
    }
}
