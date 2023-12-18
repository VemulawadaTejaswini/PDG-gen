import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();

        List<String> list = new ArrayList<>();

        for (int i=0; i < line.length(); i++) {
            char ch = line.charAt(i);

            if (ch == 'B') {
                if (list.size() != 0) list.remove(list.size() - 1);
            } else {
                list.add(String.valueOf(ch));
            }
        }

        System.out.println(String.join("", list));
    }
}