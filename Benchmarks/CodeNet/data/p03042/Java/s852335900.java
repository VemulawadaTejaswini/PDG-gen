import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String head = S.substring(0, 2);
        String tail = S.substring(2);

        int h = Integer.parseInt(head);
        int t = Integer.parseInt(tail);

        if (1 <= h && h <= 12 && 1 <= t && t <= 12) {
            System.out.println("AMBIGUOUS");
        } else if (1 <= h && h <= 12) {
            System.out.println("MMYY");
        } else if (1 <= t && t <= 12) {
            System.out.println("YYMM");
        } else {
            System.out.println("NA");
        }
    }
}