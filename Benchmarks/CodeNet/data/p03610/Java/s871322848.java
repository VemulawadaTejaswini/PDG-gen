import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        char[] ch = sc.next().toCharArray();
        int length = ch.length;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (i == 0 || i % 2 == 0) {
                sb.append(ch[i]);
            }
        }
        System.out.println(sb.toString());
    }
}
