import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (Character.isUpperCase(s.toCharArray()[0])) {
            System.out.println("A");
            return;
        }
        System.out.println("a");
    }

}
