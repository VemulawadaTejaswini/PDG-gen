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

        int cnt = 0;
        long sum1 = 0;
        for (int i = 0; i < S.length; i++) {
            char ch = S[i];
            if (ch == 'B') {
                cnt++;
                sum1+=i; // summation of initial position
            }
        }

        int i = S.length - 1;
        long sum2 = 0;
        while (cnt > 0) {
            sum2 += i;
            cnt--;
            i--;
        }

        System.out.println(sum2 - sum1);

        return;
    }

}