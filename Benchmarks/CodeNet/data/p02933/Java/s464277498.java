import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        String s;

        a = sc.nextInt();
        s = sc.next();

        if (a < 3200) {
            System.out.print("red");
        }
        else {
            System.out.print(s);
        }
    }
}