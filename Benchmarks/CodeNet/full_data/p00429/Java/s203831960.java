import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        for (;;) {
            int n = ss.nextInt();
            if (n == 0) {
                break;
            }
            StringBuffer t = new StringBuffer();
            String s = ss.next();
            while (n-- > 0) {
                t = new StringBuffer();
                for (int i = 0; i < s.length(); i++) {
                    int count = 1;
                    char kazu = s.charAt(i);
                    while (i + 1 < s.length() && kazu == s.charAt(i + 1)) {
                        count++;
                        i++;
                    }
                    t.append(count + "" + kazu);
}
                s = t.toString();
}
            System.out.println(s);
}

}
}
