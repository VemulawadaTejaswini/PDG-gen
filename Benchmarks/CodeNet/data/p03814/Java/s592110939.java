import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Pattern p = Pattern.compile("A[A-Z]*Z");
        Matcher m = p.matcher(s);
        if (m.find()) {
            System.out.println(m.group().length());
        }
    }
}