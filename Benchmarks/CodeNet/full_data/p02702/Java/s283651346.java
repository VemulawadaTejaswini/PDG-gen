import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();
        List<Long> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length(); j > (i + 4); j--) {
                String sub = s.substring(i, j);
                long num = Long.parseLong(sub);
                if (num % 2019 == 0) {
                    list.add(num);
                }
            }
        }
        System.out.println(list.size());

    }

}