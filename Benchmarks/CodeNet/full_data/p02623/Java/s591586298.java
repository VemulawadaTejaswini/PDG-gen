import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        long A []  = new long[N+1];
        long B [] = new long[M+1];
        A[0] = 0;
        B[0] = 0;
        for(int i=1;i<=N;i++) A[i] = A[i-1]+sc.nextLong();
        for(int i=1;i<=M;i++) B[i] = B[i-1]+sc.nextLong();
        int B_num = M,max=0;
        for(int i=0;i<=N;i++){
            while(B_num>=0){
                if(B[B_num]>K-A[i]) B_num--;
                else {
                    if(max<B_num+i)max = B_num+i;
                    break;
                }
            }
        }
        System.out.println(max);
    }
}