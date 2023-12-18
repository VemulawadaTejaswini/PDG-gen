import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long h = scanner.nextLong();
        if (h == 1) {
            System.out.println(1);
            return;
        }
        long w = scanner.nextLong();
        long a = h / 2;
        long b = a * w;
        long ret = b;
        
        if (h % 2 == 1) {
            if (w % 2 == 1) {
                ret += (w / 2) + 1;
            } else {
                ret += w / 2;
            }
        }
        System.out.println(ret);
    }
}