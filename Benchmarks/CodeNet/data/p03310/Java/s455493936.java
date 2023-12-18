import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        long[] sum = new long[N+1];
        for(int i = 1;i < N+1;i++)    sum[i] = sum[i-1]+sc.nextLong();
        long ans = Long.MAX_VALUE;
        long[] A = new long[4];
        for(int i = 2;i < N-1;i++){
            int min = 1;
            int max = i;
            while(true){
                int mid = (min+max)/2;
                A[0] = sum[mid]-sum[0];
                A[1] = sum[i]-sum[mid];
                if(max-min == 2 && A[0] > A[1]){
                    if(A[0]-A[1] <= (sum[i]-sum[mid-1])-(sum[mid-1]-sum[0])){
                        break;
                    }else{
                        A[0] = sum[mid-1]-sum[0];
                        A[1] = sum[i]-sum[mid-1];
                        break;
                    }
                }
                if(A[0] < A[1])   min = mid;
                else if(A[0] > A[1])    max = mid+1;
                if(A[0] == A[1] || max-min == 1)  break;
            }
            min = i+1;
            max = N;
            while(true){
                int mid = (min+max)/2;
                A[2] = sum[mid]-sum[i];
                A[3] = sum[N]-sum[mid];
                if(max-min == 2 && A[2] > A[3]){
                    if(A[2]-A[3] <= (sum[N]-sum[mid-1])-(sum[mid-1]-sum[i])){
                        break;
                    }else{
                        A[2] = sum[mid-1]-sum[i];
                        A[3] = sum[N]-sum[mid-1];
                        break;
                    }
                }
                if(A[2] < A[3])   min = mid;
                else    max = mid+1;
                if(A[2] == A[3] || max-min == 1)  break;
            }
            Arrays.sort(A);
            ans = Math.min(ans, A[3]-A[0]);
        }
        System.out.println(ans);
    }
}