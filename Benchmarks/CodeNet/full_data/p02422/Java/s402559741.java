import java.util.Scanner;

public class Main {
    public void print(String str, int a, int b) {
        String buf = str.substring(a, b + 1);
        System.out.println(buf);
    }
    public String replace(String str, int a, int b, String p) {
        String buf1 = str.substring(0, a);
        String buf2 = str.substring(b + 1, str.length());
        return buf1.concat(p).concat(buf2);
    }
    public String reverse(String str, int a, int b) {
        char[] bufString = str.toCharArray();
        char[] tmp = new char[b - a + 1];
        for (int i = 0; i < b - a + 1; i++) {
            tmp[i] = bufString[a + i];
        }
        for (int i = 0; i < b - a + 1; i++) {
            bufString[b - i] = tmp[i];
        }
        return String.valueOf(bufString);

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Main app = new Main();
        String pattern = scan.next();
        int numOfQ = Integer.parseInt(scan.next());

        for (int i = 0; i < numOfQ; i++) {
            String com = scan.next();
            switch (com) {
                case "print":
                    int a = Integer.parseInt(scan.next()), b = Integer.parseInt(scan.next());
                    app.print(pattern, a, b);
                    break;
                case "replace":
                    int c = Integer.parseInt(scan.next()), d = Integer.parseInt(scan.next());
                    String p = scan.next();
                    pattern = app.replace(pattern, c, d, p);
                    break;
                case "reverse":
                    int e = Integer.parseInt(scan.next()), f = Integer.parseInt(scan.next());
                    pattern = app.reverse(pattern, e, f);
                    break;
            }
        }

    }
}

