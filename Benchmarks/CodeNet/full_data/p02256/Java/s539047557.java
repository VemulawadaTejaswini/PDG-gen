import java.util.Scanner;

public class Main {
    public static int gcd(int a, int b){
        if(a%b != 0) b = gcd(b, a%b);
        return b;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(gcd(a, b));
        scanner.close();
    }
}
