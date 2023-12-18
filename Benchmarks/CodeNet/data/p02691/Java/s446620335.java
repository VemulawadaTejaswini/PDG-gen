
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextLong();
        }
        int ans = 0;
        for(int i=0;i<n;i++){
            long j = i + 1 + a[i];
            for(;j<n;j++){
                if(j-i == a[i] + a[(int)j]){
                    ans++;
                }
            }
        }

        System.out.println(ans);
    }
}
