import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String H = scan.next();
        String A = scan.next();

        int h = Integer.parseInt(H);
        int a = Integer.parseInt(A);

        int num = h / a;
        num = num + 1;
        
        System.out.println(num);
    }
}
