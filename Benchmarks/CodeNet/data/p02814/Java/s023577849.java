import java.util.*;

class Main {
    int N;
    long M;
    long[] A;

    public Main(){
        Scanner SC = new Scanner(System.in);
        N = SC.nextInt();
        M = SC.nextLong();
        A = new long[N];

        for(int i=0;i<N;i++){
            A[i] = SC.nextLong() / 2;
        }

        int count = -1;
        for(int i=0;i<N;i++){
            int c = 0;
            long t = A[i];
            while((t&1) == 0){
                t = t>>1;
                c++;
            }
            if(count != -1){
                if(count != c){
                    System.out.println("0");
                    return;
                }
            } else {
                count = c;
            }
        }

        long valueLCM;
        if(N > 1){
            valueLCM = valueLCM = LCM(A[0], A[1]);
            for(int i=1;i<N-1;i++){
                valueLCM = LCM(valueLCM, A[i+1]);
                if(valueLCM < 0){
                    System.out.println("0");
                    return;
                }
            }
        } else {
            valueLCM = A[0];
        }

        long L=-1, R=(M+1)/2;
        while(R-L > 1){
            long mid = L+(R-L)/2;

            if(valueLCM > M/(2*mid+1))
                R = mid;
            else
                L = mid;
        }

        System.out.println(R);
    }

    long LCM(long a, long b){
        return a / GCD(a, b) * b;
    }

    long GCD(long a, long b){
        if(b == 0) return a;
        return GCD(b, a%b);
    }

    public static void main(String[] args){
        Main m = new Main();
    }
}
