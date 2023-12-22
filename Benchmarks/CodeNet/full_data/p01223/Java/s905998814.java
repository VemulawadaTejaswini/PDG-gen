import java.util.Scanner;

public class Main {
    public static Scanner sc;
    public static void main(String[] args) throws Exception {
        sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int u = 0;
            int d = 0;
            int n = sc.nextInt();
            
            int a = sc.nextInt();
            for (int i = 0; i < n-1; i++) {
                int b = sc.nextInt();
                int diff = b - a;
                if (diff > u) {
                    u = diff;
                } else if (diff < d) {
                    d = diff;
                }
                a = b;
            }
            
            System.out.println(u + " " + d*-1);
        }
    }
}