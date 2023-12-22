import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            while (sc.hasNext()) {
                String s = sc.nextLine();
                if (s.equals("-")) {
                    break;
                }
                int m = Integer.parseInt(sc.nextLine());
                while (m > 0) {
                    int h = Integer.parseInt(sc.nextLine());
                    String s1 = s.substring(0, h);
                    String s2 = s.substring(h);
                    s = s2 + s1;
                    --m;
                }
                System.out.println(s);
            }
        } catch (NoSuchElementException
                | NumberFormatException e) {
            System.out.println(e);
        }
    }
}

