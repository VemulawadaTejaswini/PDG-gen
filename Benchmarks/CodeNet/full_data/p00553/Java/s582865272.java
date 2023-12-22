import java.util.Scanner;
 
public class Main {
 
    static Scanner sc = new Scanner(System.in);
    static int a = sc.nextInt();
    static int b = sc.nextInt();
    static int c = sc.nextInt();
    static int d = sc.nextInt();
    static int e = sc.nextInt();
    public static void main(String[] args) {
        microwave();
    }
 
    private static void microwave() {
        int t = 0;
 
            if (a < 0) {
                t += c * Math.abs(a) + d + e * b;
            } else {
                t += e * Math.abs(a - b);
            }
        System.out.println(t);
    }
 
}
