import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String str = s.next();

        int length = str.length();

        System.out.print(String.valueOf(str.charAt(0)) +
                (length-2) +
                String.valueOf(str.charAt(length-1)));
    }
}