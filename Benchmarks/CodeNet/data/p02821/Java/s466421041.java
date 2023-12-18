import java.util.*;

class Main{

    public Main(){
        Scanner scanner = new Scanner(System.in);
        int  N = scanner.nextInt();
        long M = scanner.nextLong();

        int[] A = new int[N];

        for(int i=0;i<N;i++){
            A[i] = scanner.nextInt();
        }

        Arrays.sort(A);

        int L = -1, R = A[N-1] * 2;
        while(R-L > 1){
            int mid = L + (R - L) / 2;

            long num = 0;
            for(int i=0;i<N;i++){
                num += N - binarySearch(A, mid-A[i]);
            }

            if(num < M)
                R = mid;
            else
                L = mid;
        }

        long[] S = new long[N+1];
        for(int i=0;i<N;i++) S[i+1] = S[i] + A[i];

        long count=0, result = 0;
        for(int i=0;i<N;i++){
            int num = binarySearch(A, R-A[i]);
            count  += N - num;
            result += ((long)A[i])*((long)(N-num)) + S[N] - S[num];
        }

        if(M-count>0) result += L * (M - count);
        else if(M-count<0) result -= R * (count - M);

        System.out.println(result);
    }

    int binarySearch(int[] A, int key){
        int L = -1, R = A.length;
        while(R-L>1) {
            int mid = L + (R-L) / 2;

            if(A[mid] >= key)
                R = mid;
            else
                L = mid;
        }
        return R;
    }


    public static void main(String args[]) throws Exception{
        Main main = new Main();
    }
}
