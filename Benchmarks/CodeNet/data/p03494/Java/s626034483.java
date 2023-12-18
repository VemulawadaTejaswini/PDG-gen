import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        long[] num = new long[210];
        for(int i = 0; i < n; i++) num[i] = sc.nextLong();
        boolean odd = false;
        int ans = 0;
        lp: while(!odd) {
            for(int i = 0; i < n; i++) {
                if(num[i] % 2 == 1) {
                    odd = true;
                    break lp;
                }
                num[i] /= 2;
            }
            ans++;
        }
        System.out.println(ans);
    }
}