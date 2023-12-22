import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String ans = name(str);
        System.out.println(ans);
    }

    public static String name(String str) {
        char endChar = str.charAt(str.length() - 1);
        if (endChar == 's') {
            return str + "es";
        } else {
            return str + "s";
        }
    }
}


