import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int i = 0;
        int ans = 0;
        String prev = "";
        while (i < s.length()) {
            String str;
            if (prev.length() == 1 && prev.equals(s.substring(i, i + 1))) {
                if (i + 2 >= s.length()) {
                    break;
                }
                str = s.substring(i, i + 2);
                i++;
            } else {
                str = s.substring(i, i + 1);
            }
            i++;
            ans++;
            prev = str;
        }
        System.out.println(ans);
    }

}
