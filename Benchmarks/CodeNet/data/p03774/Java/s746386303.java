import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] a = new int[N];
        int[] b = new int[N];
        int[] c = new int[M];
        int[] d = new int[M];
        long[] min = new long[N];
        int[] ans = new int[N];

        for(int i=0; i<N; i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        for(int i=0; i<M; i++){
            c[i] = sc.nextInt();
            d[i] = sc.nextInt();
        }

        for(int i=0; i<N; i++){
            min[i] = (long)Math.pow(10, 16);
            for(int j=0; j<M; j++){
                if(min[i]!=Math.abs(a[i] - c[j]) + Math.abs(b[i] - d[j])){
                    min[i] = Math.min(min[i], Math.abs(a[i] - c[j]) + Math.abs(b[i] - d[j]));
                    if(min[i]==Math.abs(a[i] - c[j]) + Math.abs(b[i] - d[j])){
                        ans[i] = j+1;
                    }
                }
            }
        }
        for(int i=0; i<N; i++){
            System.out.println(ans[i]);
        }
    }
}