import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    public void run() {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int cnt = 0;
        for (int i = A; i <= B; i++) {
            char[] s = new StringBuilder().append(i).toString().toCharArray();
            boolean ok = true;
            for (int j = 0; j < 5 / 2 ; j++) {
                if (s[j] != s[4 - j]) {
                    ok = false;
                    break;
                }
            }
            if (ok) cnt++;
        }

        System.out.println(cnt);

        return;
    }

}