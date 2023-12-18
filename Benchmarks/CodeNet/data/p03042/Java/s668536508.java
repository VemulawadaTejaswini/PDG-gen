import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();

        int zenhan = Integer.parseInt(S.substring(0,2));
        int kohan = Integer.parseInt(S.substring(2));

        if (zenhan >= 1 && zenhan <= 12 && kohan >= 1 && kohan <= 12) {
            System.out.println("AMBIGUOUS");
        }
        else if (zenhan >= 1 && zenhan <= 12 && kohan >= 0) {
            System.out.println("MMYY");
        }
        else if (zenhan >= 0  && kohan >= 1 && kohan <= 12) {
            System.out.println("YYMM");
        }
        else {
            System.out.println("NA");
        }

    }
}