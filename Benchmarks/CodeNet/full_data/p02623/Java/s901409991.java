import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();

        int[] A = new int[N];
        int[] B = new int[M];

        for(int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }

        for(int i=0; i<M; i++) {
            B[i] = sc.nextInt();
        }

        int result = 0;
        long time = 0;
        int Aindex = 0;
        int Bindex = 0;

        main:while(time <= K) {
            int tmp = 0;

            while(true) {
                if(Aindex + tmp >= N) {
                    if(Bindex + tmp >= M) {
                        break main;
                    }

                    if(time+B[Bindex] > K) {
                        break main;
                    }
                    time += B[Bindex];
                    Bindex++;
                    result++;
                    tmp = 0;
                    break;
                }else if(Bindex + tmp >= M) {
                    if(time+A[Aindex] > K) {
                        break main;
                    }
                    time += A[Aindex];
                    Aindex++;
                    result++;
                    tmp = 0;
                    break;
                }
                //System.err.println("A:" + A[Aindex] + " B:" + B[Bindex]);

                if(A[Aindex+tmp] < B[Bindex+tmp]) {
                    //System.err.println("A");
                    if(time+A[Aindex] > K) {
                        break main;
                    }
                    time += A[Aindex];
                    Aindex++;
                    result++;
                    tmp = 0;
                    break;
                }else if(A[Aindex+tmp] > B[Bindex+tmp]) {
                    //System.err.println("B");
                    if(time+B[Bindex] > K) {
                        break main;
                    }
                    time += B[Bindex];
                    Bindex++;
                    result++;
                    tmp = 0;
                    break;
                }
                tmp++;
            }
        }

        System.out.println(result);
    }
}