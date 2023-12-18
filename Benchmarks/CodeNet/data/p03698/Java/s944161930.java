import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String S[] = s.split("");
        for (int i = 0; i < S.length; i++) {
            String check = S[i];
            for (int j = 0; j < S.length; j++) {
                if (i == j)
                    continue;
                if (S[i].equals(S[j])) {
                    System.out.println("no");
                    return;
                }
            }
        }
        System.out.println("yes");
    }
}