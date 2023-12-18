import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    public void run() {
        Scanner sc = new Scanner(System.in);
        char[] S = sc.next().toCharArray();

        boolean foundC = false;
        if (S[0] == 'A') {
            if (S[1] >= 'A' && S[1] <= 'Z') {
                System.out.println("WA");
                return;
            }

            for (int i = 2; i <= S.length - 2; i++) {
                if (S[i] == 'C') {
                    if (foundC) {
                        System.out.println("WA");
                        return;
                    }
                    else foundC = true;
                } else if (S[i] >= 'A' && S[i] <= 'Z') {
                    System.out.println("WA");
                    return;
                }
            }

            char lastch = S[S.length - 1];
            if (lastch >= 'A' && lastch <= 'Z') {
                System.out.println("WA");
                return;
            }
        }

        if (foundC) System.out.println("AC");
        else System.out.println("WA");

        return;
    }

}