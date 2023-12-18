import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int frag = x % 100;
        int num = x / 100;
        if (frag < num * 5) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        sc.close();
    }

}
