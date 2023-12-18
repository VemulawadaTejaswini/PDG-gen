import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static int MOD = 1_000_000_007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] a = new int[N];
        int[] b = new int[M];
        int[][] c = new int[N*M][2];
        for(int i = 0; i <N*M; i++)Arrays.fill(c[i], -1);
        int min = Integer.MAX_VALUE;
        long ans = 1;
        boolean valid = true;
        for(int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
            if(a[i] < min) min = a[i];
            if(c[a[i]-1][0] != -1){
                valid = false;
                break;
            }else c[a[i]-1][0] = i;
        }
        for(int i = 0; i < M; i++) {
            b[i] = sc.nextInt();
            if(b[i] < min) min = b[i];
            if(c[b[i]-1][1] != -1){
                valid = false;
                break;
            }else c[b[i]-1][1] = i;
        }
        if(valid){
            long n = 0;
            long m = 0;
            long count = 0;
            for(int i = N*M; i >= min; i--){
                count = N*M-i;
                if(c[i-1][0] != -1 && c[i-1][1] != -1){
                    n++; m++;
                    continue;
                }else if(c[i-1][0] == -1 && c[i-1][1] == -1){
                    if(n*m -count < count){
                        ans = 0;
                        break;
                    }else{
                        ans = (ans * (n*m -count))%MOD;
                    }
                }else if(c[i-1][0] == -1 && c[i-1][1] != -1){
                    ans = (ans * n)%MOD;
                    m++;
                }else if(c[i-1][0] != -1 && c[i-1][1] == -1){
                    ans = (ans * m)%MOD;
                    n++;
                }
            }
            if(min >2) for(int i = min-1; i >0; i--) ans = (ans * i)%MOD;
            System.out.println(ans);
        }else{
            System.out.println(0);
        }
        sc.close();
    }

}
