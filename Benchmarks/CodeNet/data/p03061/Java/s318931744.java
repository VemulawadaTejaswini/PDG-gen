import java.util.*;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        int[] L = new int[N + 1];
        int[] R = new int[N + 1];
        L[0] = 0;
        R[N] = 0;

        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
        }
        int max = 0;
        for(int i=0; i<N; i++){
            for(int j=0; j<i; j++){
                if(j==0){
                    L[j + 1] = A[j];
                    continue;
                }
                L[j + 1] = getCommonDivisor(L[j], A[j]);
            }
            for(int j=N-1; j>i; j--){
                if(j==N-1){
                    R[j] = A[j];
                    continue;
                }
                R[j] = getCommonDivisor(R[j + 1], A[j]);
            }
            if(i==0){
                max = Math.max(max, R[i + 1]);
                continue;
            }
            if(i==N-1){
                max = Math.max(max, L[i]);
                continue;
            }
            max = Math.max(max, getCommonDivisor(L[i], R[i + 1]));
        }
        System.out.println(max);
    }

    

    private static int getCommonDivisor(int x, int y){
        int bigger = Math.max(x, y);
        int smaller = Math.min(x, y);
        int surplus = bigger % smaller;
        
        if(surplus==0){
            return smaller;
        }
        surplus = getCommonDivisor(smaller, surplus);

        return surplus;
    }
}