import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long num = scan.nextInt();

        ArrayList<Long> list = new ArrayList<>();

        while (true) {
            list.add(0, num % 26);
            if (num /26 == 0) break;
            else num /= 26;
        }

        for (long i : list) {
            System.out.print((char)(i + 'a' - 1));
        }
        System.out.println();
    }
}
