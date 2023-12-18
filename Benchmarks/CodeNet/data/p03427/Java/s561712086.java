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


        int f = S[0] - '0';

        int ans = 0;
        if (S.length == 1) {
            ans = f;
        } else {
            f--;
            ans = (S.length - 1) * 9 + f;
        }
        
        System.out.println(ans);


        return;
    }

}