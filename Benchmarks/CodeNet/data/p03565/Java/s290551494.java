import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        String Sprime = sc.next();
        String T = sc.next();
        String S[] = new String[Sprime.length() - T.length() + 1];
        check:
        for (int i = Sprime.length() - T.length(); i >= 0; i--) {
            for (int j = 0; j < T.length(); j++) {
                if (T.charAt(j) == Sprime.charAt(i + j) || Sprime.charAt(i + j) == '?') {
                } else {
                    continue check;
                }
            }
            S[i] = "";
            for (int j = 0; j < Sprime.length(); j++) {
                if (j >= i && j < i + T.length()) {
                    S[i] += T.charAt(j - i);
                } else if (Sprime.charAt(j) == '?') {
                    S[i] += 'a';
                } else {
                    S[i] += Sprime.charAt(j);
                }
            }
        }
        boolean flag = false;
        String ans = "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz";
        for (int i = 0; i < Sprime.length() - T.length()+1; i++) {
            if (S[i] != null && ans.compareTo(S[i]) >= 0) {
                flag = true;
                ans = S[i];
            }
        }
        if (flag) {
            System.out.println(ans);
        } else {
            System.out.println("UNRESTORABLE");
        }
    }
}
