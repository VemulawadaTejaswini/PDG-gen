import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        String[] s = str.split("");
        long div = (long) Math.pow(10, 9) + 7;

        long count = 0;
        for (int i = 0; i < Math.pow(2, n); i++) {
            boolean alreadyUsedString = false;
            List<String> list = new ArrayList<>();
            for (int j = 0; j <= n; j++) {
                if (i == 0 && j == 0) {
                    continue;
                }
                if (((i >> j) & 1) == 1) {
                    if (list.contains(s[j])) {
                        alreadyUsedString = true;
                        break;
                    }
                    list.add(s[j]);
                }
            }
            String result = String.join("", list);
            if ("".equals(result) || alreadyUsedString) {
                continue;
            }
            count++;
        }
        System.out.println(count % div);
    }
}
