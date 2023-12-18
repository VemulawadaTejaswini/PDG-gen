import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 0;
        for(int i = 0; i < n; i++) {
            long l = sc.nextInt();
            long count = 0;
            while(l%2==0) {
                l/=2;
                count++;
            }
            ans += count;
        }
        System.out.println(ans);
    }
}
