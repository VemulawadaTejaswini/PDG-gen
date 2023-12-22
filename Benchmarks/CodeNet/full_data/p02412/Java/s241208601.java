import java.util.Scanner;
 
class Main {
    Scanner sc = new Scanner(System.in);
 
    public void run() {
        while (true) {
            int n = sc.nextInt(), x = sc.nextInt();
            if (n == 0 && x == 0) {
                break;
            }
            int count = 0;
            for (int a = 1; a <= n; a++)
                for (int b = a + 1; b <= n; b++)
                    for (int c = b + 1; c <= n; c++) {
                        if (a + b + c == x) {
                            count++;
                        }
                    }
            ln(count);
        }
    }
 
    public static void main(String[] args) {
        new Main().run();
    }
 
    public static void pr(Object o) {
        System.out.print(o);
    }
 
    public static void ln(Object o) {
        System.out.println(o);
    }
 
    public static void ln() {
        System.out.println();
    }
}
