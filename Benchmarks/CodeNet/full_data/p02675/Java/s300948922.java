import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        char c = n.charAt(n.length() - 1);
        if (c == '2' || c == '4' || c == '5' || c == '7' || c == '9') {
            System.out.println("hon");
        } else if (c == '3') {
            System.out.println("bon");
        } else {
            System.out.println("pon");
        }
    }

}
