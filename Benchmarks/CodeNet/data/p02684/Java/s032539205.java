import java.util.*;

public class Main {

    static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}
    static int mod = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long K = sc.nextLong();
        int[] A = new int[N];
        long[] teleported = new long[N];

        for(int i=0;i<N;i++){
            A[i] = sc.nextInt();
            teleported[i] = -1;
        }

        int currentPoint = 1;
        teleported[0] = 0;
        long warpCount = 0;
        long loop;
        long restOfLoop=0l;
        for(int i=0;i<N-1;i++){
            warpCount++;
            currentPoint = A[currentPoint-1];
            if(teleported[currentPoint-1] == -1){
                teleported[currentPoint-1] = warpCount;
            } else {
                loop = warpCount - teleported[currentPoint-1];
                restOfLoop = (K - teleported[currentPoint-1]) % loop;
                break;
            }
        }

        for(int i=0;i<restOfLoop;i++){
            currentPoint = A[currentPoint-1];
        }
        System.out.println(currentPoint);

    }

}







