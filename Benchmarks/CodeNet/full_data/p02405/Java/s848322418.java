import java.util.Scanner;
 
class Main {
    Scanner sc = new Scanner(System.in);
 
    public void run() {
        while (true) {
            int H = sc.nextInt(), W = sc.nextInt();
            if (H == 0 && W == 0) {
                break;
            }
            for (int h = 0; h < H; h++) {
                for (int w = 0; w < W; w++) {
                    pr((h+w)%2==0 ? "#"
                            : ".");
                }
                ln();
            }
            ln();
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
