import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 配列
        int n = sc.nextInt();
        long[] a = new long[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        long ans =0;
        for(int i=0; i<n;i++) {
            for (int j=i+1;j<n;j++) {
                ans = (ans + a[i] * a[j]) % 1000000007L;
            }
        }
        System.out.println(ans);
    }
   
}

