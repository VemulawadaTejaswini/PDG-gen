import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        long sum = 0;
        for(int i = 0; i < n; i++){
            a[i] = scan.nextInt();
            sum += a[i];
        }
        long csum = 0;
        for(int i = 0; i < n; i++){
            if(csum > sum / 2){
                if(i <= 1) System.out.println(Math.abs(csum - (sum - csum)));
                else System.out.println(Math.min(Math.abs(csum - (sum - csum)), Math.abs(csum - a[i - 1] - (sum - (csum - a[i - 1])))));
                return;
            }
            csum += a[i];
        }
        scan.close();
    }

    public static void main(String[] args){
        new Main().solve();
    }
}