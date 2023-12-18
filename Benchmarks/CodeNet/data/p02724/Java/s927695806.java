
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = x / 500;
        int b = x % 500;
        int c = b / 5;
        System.out.println(a * 1000+ c * 5);
    }

}
