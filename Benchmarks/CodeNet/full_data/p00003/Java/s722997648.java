import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            boolean bo = isTriangle(a, b, c) || isTriangle(b, c, a) || isTriangle(c, a, b);
            if (bo) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
    
    public static boolean isTriangle(int a, int b, int c) {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)) == c;
    }
}