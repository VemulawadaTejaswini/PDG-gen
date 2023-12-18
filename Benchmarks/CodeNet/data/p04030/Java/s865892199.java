import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int i = 0;
        while (s.contains("B")) {
            if (s.charAt(i) == 'B') {
                s = s.replaceFirst("(.?B)", "");
                i = -1;
            }
            i++;
        }
        System.out.println(s);
    }
}