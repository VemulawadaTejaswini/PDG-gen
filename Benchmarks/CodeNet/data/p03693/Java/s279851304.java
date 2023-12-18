import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();
        String b = scanner.next();
        String c = scanner.next();
        int num = Integer.parseInt(a+b+c);

        if(num%4==0) {
            System.out.println("YES");
        }
        System.out.println("NO");
    }
}