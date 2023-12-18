import java.util.*;

class Main {
    final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        String s = sc.next();
        String t = sc.next();
        System.out.println(t.startsWith(s) && s.length()+1 == t.length() ? "Yes" : "No");
    }
}

