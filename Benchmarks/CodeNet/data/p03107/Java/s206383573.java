import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.next().split("");
        List<String> sList = new ArrayList<>(Arrays.asList(s));
        int count = 0;
        while (true) {
            boolean removed = false;
            for (int i = 0; i < sList.size() - 1; i++) {
                String target = sList.get(i);
                String next = sList.get(i + 1);
                if ("0".equals(target) && "1".equals(next)
                        || "1".equals(target) && "0".equals(next)) {
                    sList.remove(i + 1);
                    sList.remove(i);
                    count += 2;
                    removed = true;
                    continue;
                }
            }
            if (!removed) {
                break;
            }
        }
        System.out.println(count);
    }

}
