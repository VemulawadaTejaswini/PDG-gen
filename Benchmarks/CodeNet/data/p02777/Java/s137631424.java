import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        String s = stdIn.next();
        String t = stdIn.next();
        int a = Integer.parseInt(stdIn.next());
        int b = Integer.parseInt(stdIn.next());
        String u = stdIn.next();

        if (u.equals(s)) {
            a--;
        } else if (u.equals(t)) {
            b--;
        }

        System.out.println(a + " " + b);
    }
}