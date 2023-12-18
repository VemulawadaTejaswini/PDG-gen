import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        int a = x;
        x = y;
        y = a;
        a = x;
        x = z;
        z = a;
        System.out.print(x);
        System.out.print(' ');
        System.out.print(y);
        System.out.print(' ');
        System.out.println(z);
    }
}
