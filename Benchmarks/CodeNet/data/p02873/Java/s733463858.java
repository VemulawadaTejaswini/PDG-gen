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
        int N = S.length;


        int[] ans = new int[N+1];
        ans[0]=0;
        int min = 0;
        for (int i = 0; i < N; i++) {
            char ch = S[i];
            if (ch == '<') ans[i+1]=Math.max(ans[i+1], ans[i]+1);
        }

       for (int i = N - 1; i >= 0; i--) {
            char ch = S[i];
            if (ch == '>') ans[i]=Math.max(ans[i], ans[i + 1]+1);
        }

        int sum = 0;
        for (int a : ans) {
            sum += a;
        }

        System.out.println(sum);
        
        return;
    }

}