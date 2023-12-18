import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        List<String> strList = IntStream.range(0, s.length).mapToObj(i -> String.valueOf(s[i])).collect(Collectors.toList());
        sc.nextLine();
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            sc.nextLine();
            int t = sc.nextInt();
            if (t == 1) {
                Collections.reverse(strList);
            } else {
                int f = sc.nextInt();
                if (f == 1) {
                    strList.add(0, sc.next());
                } else {
                    strList.add(sc.next());
                }
            }
        }
        System.out.println(String.join("", strList));
    }
}
