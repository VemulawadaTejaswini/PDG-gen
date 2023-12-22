import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        long ans = 0;
        for (int k = 1; k <= n; k++) {
            int divNum = 0;
            int i;
            for (i = 1; i < Math.sqrt(k); i++) {
                if (k % i == 0) {
                    divNum++;
                }
            }
            divNum *= 2;
            if (Math.sqrt(k) == i) {
                divNum++;
            }
            ans += k * divNum;
        }
        
        System.out.println(ans);
    }
}
