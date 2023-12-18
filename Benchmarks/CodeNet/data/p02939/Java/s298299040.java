import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    private int check(String S, int sz, String prev, int max, int pos) {
        if (pos == S.length()) { 
            return sz;
        }

        for (int i = 1; pos + i <= S.length(); i++) {
            String s = S.substring(pos, pos + i);
            if (prev.equals(s)) continue;
            return check(S, sz + 1, s, max, pos + i);
        }
        return sz;
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();

        int max = check(S, 0, "", 0, 0);

        System.out.println(max);

        return;
    }

}