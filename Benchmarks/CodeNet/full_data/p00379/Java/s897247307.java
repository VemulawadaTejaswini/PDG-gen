import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int count = 0;
        for (int i = 1; Math.pow(i + a, n) <= m; i++) {
            int x = (int)(Math.pow(i + a, n));
            int y = getCount(x);
            if (y == i) {
                count++;
            }
        }
        System.out.println(count);
    }
    
    static int getCount(int x) {
        int count = 0;
        while (x > 0) {
            count += x % 10;
            x /= 10;
        }
        return count;
    }
}

