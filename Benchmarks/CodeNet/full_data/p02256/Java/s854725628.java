import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a < b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        System.out.println(GCV(a, b));
    }

    public static int GCV(int a, int b) {
        if (b == 0) {
            return a;
        }
        return GCV(b, a%b);
    }
}

