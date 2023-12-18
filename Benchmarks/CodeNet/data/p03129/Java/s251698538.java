import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int a = getInt();
        int b = getInt();

        if((a + 1) / 2 >= b) {
            print("YES");
        } else {
            print("NO");
        }
    }

    public static int getInt() {
        return scan.nextInt();
    }

    public static String getLine() {
        return scan.nextLine();
    }

    public static int toInt(String str) {
        return Integer.parseInt(str);
    }

    public static long toLong(String str) {
        return Long.parseLong(str);
    }

    public static void print(String str) {
        System.out.println(str);
    }
}
