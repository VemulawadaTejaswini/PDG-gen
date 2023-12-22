import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcd(a, b));
    }
    static int gcd (int a, int b) {
        int num;
        while((num = a%b)!=0) {
            a = b;
            b = num;
        }
        return b;
    }

}
