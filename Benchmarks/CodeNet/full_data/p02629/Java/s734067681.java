import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long x = in.nextLong();
        System.out.println(asd(x - 1));
    }

    public static String asd(long i) {
        if (i < 0) {
            return "-" + asd(-i - 1);
        }

        long quot = i / 26;
        long rem = i % 26;
        char letter = (char) ((int) 'a' + rem);
        if (quot == 0) {
            return "" + letter;
        } else {
            return asd(quot - 1) + letter;
        }
    }
}
