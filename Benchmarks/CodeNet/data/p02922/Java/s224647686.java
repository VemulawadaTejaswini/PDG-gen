import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();

        int value = Y - X;
        int Z = X - 1;
        if (value / Z == 0) {
            if (Y > X) {
                System.out.println(2);
            } else {
                System.out.println(1);
            }
        } else {
            System.out.println(value / Z + 1);
        }

    }
}