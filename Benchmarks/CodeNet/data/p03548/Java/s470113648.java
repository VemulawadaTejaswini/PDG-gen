import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        int a = y + z;
        int b = x / a;
        int c = b*a + z;
        if (c <= x) {
            System.out.println(b);
        } else {
            System.out.println(b-1);
        }
    }

}