import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (true) {
            String s = sc.nextLine();
            if (s.equals("END OF INPUT")) {
                break;
            }
            for (String x : s.split(" ")) {
                sb.append(x.length());
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
