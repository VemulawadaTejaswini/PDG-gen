import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();

        ArrayList<String> list = new ArrayList<>();

        int c = 0;
        boolean flag = false;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
                String str = s.substring(i, j);
                if (!list.contains(str)) {
                    list.add(str);
                }

                if (c == k) {
                    flag = true;
                    break;
                }
            }

            if (flag) {
                break;
            }
        }

        Collections.sort(list);
        System.out.println(list.get(k-1));
    }
}
