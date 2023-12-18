import java.util.*;
 
public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int y = sc.nextInt();
        int a = -1;
        int b = -1;
        int c = -1;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; i + j <= n; j++) {
                int k = n - i - j;
                if (y == (10000*i + 5000*j + 1000*k)) {
                    a = i;
                    b = j;
                    c = k;
                }
            }
        }
        System.out.println(a + " " + b + " " + c);
    }
}