import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        long[] ai = new long[n];
        long[] aj = new long[n];
        for (int i=0;i<n;i++) {
            a[i] = sc.nextLong();
            ai[i] = a[i] + i;
            aj[i] = i - a[i];
        }
        long ans=0;
        for (int i=0;i<n;i++) {
            for (int j=i+1;j<n;j++) {
                if(ai[i] == aj[j]){
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
