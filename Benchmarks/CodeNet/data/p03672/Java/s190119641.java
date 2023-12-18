import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        sb.append(sc.next());
        do {
            sb.deleteCharAt(sb.length() - 1);
            if (sb.length() % 2 != 0) continue;
            String fw = sb.substring(0, (sb.length() / 2) - 1);
            String bw = sb.substring((sb.length() / 2), sb.length() - 1);
            if (fw.equals(bw)) {
                break;
            }
        } while(true);
        System.out.println(sb.length());
    }
}
