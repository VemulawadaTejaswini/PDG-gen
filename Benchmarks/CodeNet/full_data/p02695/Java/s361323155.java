import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());
        int Q = Integer.parseInt(sc.next());
        int[] a = new int[N];
        int[] b = new int[N];
        int[] c = new int[N];
        int[] d = new int[N];
        int[] A = new int[10];
        int ans = 0;
        
        for(int i = 0; i < Q; i++) {
            a[i] = Integer.parseInt(sc.next());
            b[i] = Integer.parseInt(sc.next());
            c[i] = Integer.parseInt(sc.next());
            d[i] = Integer.parseInt(sc.next());
        }
        
        for(A[0] = 1; A[0] <= M; A[0]++) {
            for(A[1] =A[0]; A[1] <= M; A[1]++) {
                for(A[2] =A[1]; A[2] <= M; A[2]++) {
                    for(A[3] =A[2]; A[3] <= M; A[3]++) {
                        for(A[4] =A[3]; A[4] <= M; A[4]++) {
                            for(A[5] =A[4]; A[5] <= M; A[5]++) {
                                for(A[6] =A[5]; A[6] <= M; A[6]++) {
                                    for(A[7] =A[6]; A[7] <= M; A[7]++) {
                                        for(A[8] =A[7]; A[8] <= M; A[8]++) {
                                            for(A[9] =A[8]; A[9] <= M; A[9]++) {
                                                int sum = 0;
                                                for(int i = 0; i < Q; i++) {
                                                    if(A[b[i]-1] - A[a[i]-1] == c[i]) {
                                                        sum += d[i];
                                                    }
                                                }
                                                if(ans < sum) {
                                                    ans = sum;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        
        System.out.println(ans);
        

    }
}