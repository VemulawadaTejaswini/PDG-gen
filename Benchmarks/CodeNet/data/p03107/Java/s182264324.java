import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            String S = in.nextLine();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < S.length(); i++) {
                list.add(S.charAt(i) - '0');
            }

            int count = 0;
            for (int i = 0; i + 1 < list.size(); i++) {
                if (list.get(i) != list.get(i + 1)) {
                    list.remove(i);
                    list.remove(i);
                    i = -1;
                    count += 2;
                    continue;
                }
            }

            System.out.println(count);
        }
    }
}
