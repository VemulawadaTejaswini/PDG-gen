import java.util.*;
class Main{
    static long INF = 1001001001001001001L;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] x = new long[n];
        int k = scanner.nextInt();
        long min = Long.MAX_VALUE;
        for(int i = 0; i < n; i++){
            x[i] = scanner.nextInt();
        }
        for(int i = 0; i < n-k + 1; i++){
            int l = i;
            int r = i+k-1;
            long cur = Math.min(Math.abs(x[l]) + Math.abs(x[r]-x[l]), Math.abs(x[r]) + Math.abs(x[r]-x[l]));
            min = Math.min(cur, min);
        }
        if(min == Long.MAX_VALUE){System.out.println(0);return;}
        System.out.println(min);
    }
}
