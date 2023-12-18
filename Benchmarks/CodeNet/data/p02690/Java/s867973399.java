import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        outer: for (int a = 1000; a > 0; a--) {
            for (int b = a; b > -1000; b--) {
                if (pow(a, 5) - pow(b, 5) == x) {
                    System.out.printf("%d %d\n", a, b);
                    break outer;
                }
            }
        }
    }
    static  int pow(int num, int times) {
        int result = 1;
        for (int i = 0; i < times; i++) {
            result *=  num;
        }
        return result;
    }
}
