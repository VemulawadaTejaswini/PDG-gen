import java.util.*;

class Main{

    public Main(){
        int N;
        long K;
        long[] A;
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        K = scanner.nextLong();

        A = new long[N];
        for(int i=0;i<N;i++){
            A[i] = scanner.nextLong();
        }

        Arrays.sort(A);

        long L = -1000000000000000001L,
             R =  1000000000000000001L;
        while(R-L>1){
            long mid = L + (R-L)/2;

            long num = 0;
            for(int i=0;i<N;i++){
                if(A[i] == 0){
                    if(mid > 0) num += N;
                } else {
                    int l = -1, r = N;
                    if(A[i] > 0) {
                        while(r-l > 1){
                            int m = l + (r-l)/2;
                            if(mid < A[i]*A[m])
                                r = m;
                            else
                                l = m;
                        }
                        num += l;
                    } else{
                        while(r-l>1){
                            int m = l + (r-l)/2;
                            if(mid > A[i]*A[m])
                                r = m;
                            else
                                l = m;
                        }
                        num += N-r;
                    }
                }
            }

            if(K < num)
                R = mid;
            else
                L = mid;
        }

        System.out.println(R);
    }

    public static void main(String args[]) throws Exception{
        Main main = new Main();
    }
}
