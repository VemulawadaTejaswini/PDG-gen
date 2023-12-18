import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String i = s.next();
        if (i.indexOf("7") != -1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}