import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        List<String> list = new ArrayList<>();

        boolean isDifferentChar = true;
        for (int i = 0; i < s.length(); i++) {
            String obj = new String(new char[]{s.charAt(i)});
            if (list.contains(obj)) {
                isDifferentChar = false;
                break;
            }

            list.add(obj);
        }

        System.out.println(isDifferentChar ? "yes" : "no");
    }
}
