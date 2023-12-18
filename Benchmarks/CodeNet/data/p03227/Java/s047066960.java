import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String ret = "";
        if (s.length() == 2) ret = s;
        else for (int i = 2; i >= 0; i--) ret += s.charAt(i);
        System.out.println(ret);
    }
}