import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s  =new Scanner(System.in);
        int n = s.nextInt(), k = s.nextInt();
        String line = s.next();

        List<Integer> list = new ArrayList<>();

        {
            String line2 = line + "$";
            char c = line2.charAt(0);
            int cnt = 1;
            for (int i = 1; i < line2.length(); ++i) {
                if (c != line2.charAt(i)) {
                    list.add(cnt);
                    cnt = 1;
                    c = line2.charAt(i);
                } else {
                    ++cnt;
                }
            }
        }

        if (line.charAt(0) == '0') {
            list.add(0, 0);

        }
        if (line.charAt(line.length() - 1) == '0') {
            list.add(0);
        }

        int max = 0, cnt = 0;
        for (int i = 0; i < list.size(); ++i) {
            if (i  < k * 2 + 1) {
                cnt += list.get(i);
            } else if (i % 2 != 0) {
                cnt -= list.get(i - k * 2 - 1);
                cnt -= list.get(i - k * 2);
                cnt += list.get(i);
                cnt += list.get(i + 1);
            }
            max = Math.max(max, cnt);
        }
        System.out.println(max);
    }
}
