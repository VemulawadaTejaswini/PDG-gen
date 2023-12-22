import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int c=1; c<=n-1; c++) {
            int ma = (int)Math.sqrt(n-c);
            if ((double)ma == Math.sqrt(n-c)) {
                for (int a=1; a<=ma; a++) {
                    if ((n-c) % a == 0) {
                        count += 2;
                    }
                }
                count--;
            } else {
                for (int a=1; a<=ma; a++) {
                    if ((n-c) % a == 0) {
                        count += 2;
                    }
                }
            }
        }
        System.out.print(count);
    }
}
