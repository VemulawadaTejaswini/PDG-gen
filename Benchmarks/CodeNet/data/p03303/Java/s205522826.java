import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int length = str.length();
        int n = Integer.parseInt(sc.next());
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < length; i += n) {
            ans.append(str.charAt(i));
        }
        System.out.println(ans);
    }
}
