import java.util.Scanner;
public class Main {
    public static voidmain(String[] args) {
        Scanner sc= newScanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int area = a*b;
        int length = 2 * (a + b);
        System.out.println(area + " " + length);
    }
}