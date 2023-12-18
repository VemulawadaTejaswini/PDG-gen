import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        String S = sc.next();

        String abc = "";
        int r = 0;
        for (int i = 0; i < N; i++) {
            char s = S.charAt(i);
            if (abc.equals("") && s == 'A'
                    || abc.equals("A") && s == 'B') {
                abc += s;
            } else if (abc.equals("AB") && s == 'C') {
                abc = "";
                r += 1;
            } else {
                abc = "";
            }
        }
        System.out.println(r);
    }
}