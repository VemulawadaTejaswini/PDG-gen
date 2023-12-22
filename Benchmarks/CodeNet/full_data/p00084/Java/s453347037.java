import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String[] lines = sc.nextLine().split("[., ]");
            int c = 0;
            for (int i = 0; i < lines.length; i++) {
                if (lines[i].length() > 2 && lines[i].length() < 7) {
                    System.out.print((c++ == 0 ? "" : " ") + lines[i]);
                }
            }
            if (c > 0) {
                System.out.println();
            }
        }
    }
}
