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
        int cnt = 0;
        for(int i=0;i<=N;i++){
            if(A[i]>K)break;
            int min = 0,max = M-1;
            int mid = max/2;
            long r = K-A[i];
            while(mid<max){
                if(B[mid]<=r) min = mid;
                else max = mid-1;
                if((min+max)%2==0) mid = (min+max)/2;
                else mid = (min+max+1)/2;
            }
            if(B[mid+1]<=r) cnt=mid+i+1;
            else cnt = mid+i;
        }
        System.out.println(cnt);
    }
}