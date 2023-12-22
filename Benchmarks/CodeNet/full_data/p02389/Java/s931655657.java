import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final String line = readLine();
        System.out.println(calc(line));
    }

    protected static String calc(String input) {
        String s[] = input.split(" ");

        int y = Integer.parseInt(s[0]);
        int x = Integer.parseInt(s[1]);

        int area = y * x;
        int circumference = y + y + x + x;

        return area + " " + circumference;
    }

    private static String readLine() {
        Scanner s = null;
        try {
            s = new Scanner(System.in);
            return s.nextLine();
        } finally {
            if (s != null) {
                s.close();
            }
        }
    }
}