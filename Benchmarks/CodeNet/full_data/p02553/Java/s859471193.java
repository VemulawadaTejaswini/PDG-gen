import java.util.Scanner;
//atcoderはScannerクラスのsc.next()で行ける
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();
        long d = sc.nextInt();

        long[] ab = new long[]{a,b};
        long[] cd = new long[]{c,d};
        long ans = Long.MIN_VALUE;
        for (long i : ab){
            for (long j : cd){
                if (ans<i*j){
                    ans=i*j;
                }
            }
        }
        System.out.println(ans);
    }
}