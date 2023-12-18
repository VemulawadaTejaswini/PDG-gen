import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int pre = Integer.parseInt(s.substring(0, 2));
        int post = Integer.parseInt(s.substring(2));
        if ((pre == 0 || pre >= 13) && (post >= 1 && post <= 12)) {
            System.out.println("YYMM");
        } else if ((pre >= 1 && pre <= 12) && (post == 0 || post >= 13)) {
            System.out.println("MMYY");
        } else if ((pre >= 1 && pre <= 12) && (post >= 1 && post <= 12)) {
            System.out.println("AMBIGUOUS");
        } else {
            System.out.println("NA");
        }
        sc.close();
    }
}