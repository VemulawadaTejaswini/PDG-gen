import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        String target = sc.next();

        try {
            System.out.println(target.substring(0, len));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(target);
        }

    }
}
