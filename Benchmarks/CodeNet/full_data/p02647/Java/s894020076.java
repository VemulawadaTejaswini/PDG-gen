import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long K = sc.nextLong();
        int[] A = new int[N];
        for(int i=0;i<N;i++){
            A[i] = sc.nextInt();
        }
        for(int i=0;i<K;i++){
            int[] B = new int[N];
            for(int j=0;j<N;j++){
                add(B, j-A[j], j+A[j]);
            }
            A = B;
        }
        for(int i=0;i<N;i++){
            System.out.print(A[i] + " ");
        }
    }

    public static void add(int[] B, int s ,int e){
        s = Math.max(s, 0);
        e = Math.min(e, B.length-1);
        for(int i=s;i<=e;i++){
            B[i]++;
        }
    }

}
