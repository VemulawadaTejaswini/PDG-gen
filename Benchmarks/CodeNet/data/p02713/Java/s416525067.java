import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1, b = 1, c = 1;
        int r = 0;
        int s = 0;
        int value = 0;
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                a = i; b = j;
                while( (r = a % b) != 0 ) {
                    a = b;
                    b = r;
                }
                for (int k = 1; k <= n; k++) {
                    c = k;
                    while( (r = b % c) != 0 ) {
                        b = c;
                        c = r;
                    }
                    value += c;
                }   
            }
        }
        
        System.out.println(value);
    }
}
