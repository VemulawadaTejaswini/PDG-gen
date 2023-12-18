import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        int format = Integer.parseInt(S);
        int left = format / 100;
        int right = format % 100;

        if (1 <= left && left <= 12 && 1 <= right && right <= 12) {
            System.out.println("AMBIGUOS");
            return;
        }
        if (1 <= left && left <= 12) {
            System.out.println("MMYY");
            return;
        }
        if (1 <= right && right <= 12) {
            System.out.println("YYMM");
            return;
        }
        System.out.println("NA");


    }
}
