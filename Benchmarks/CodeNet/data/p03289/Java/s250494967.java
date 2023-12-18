import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String str = s.substring(3);
        if (s.substring(0, 1).equals("A")
                && Character.isLowerCase(s.charAt(1))
                && s.substring(2, 3).equals("C")
                && str.equals(str.toLowerCase())
        ) {
            System.out.println("AC");
            return;
        }
        System.out.println("WA");
    }

}
