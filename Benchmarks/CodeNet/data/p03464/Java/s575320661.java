import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] a = new int[k];
        for(int i=0; i<k; i++){
            a[i] = sc.nextInt();
        }
        sc.close();
        
        long[] range = new long[]{2, 3};
        for(int i=k-2; i>=0; i--){
            range = step(range, a[i]);
            if(range[0] == -1){
                System.out.println("-1");
                return;
            }
        }
        
        System.out.println(range[0] + " " + range[1]);
    }

    public static long[] step(long[] range, long n){
        long[] ans = new long[]{-1, -1};
        long al = range[0] / n;
        long bl = range[0] % n;
        long ar = range[1] / n;
        long br = range[1] % n;

        if(ar - al == 0 && bl != 0){
            return ans;
        }

        if(bl == 0){
            ans[0] = range[0];
            ans[1] = ar*n + n-1;
        }else{
            ans[0] = al*n + n;
            ans[1] = ar*n+n-1;
        }

        return ans;
    }
}