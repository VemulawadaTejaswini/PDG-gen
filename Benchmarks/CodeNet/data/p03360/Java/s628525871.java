import java.util.Scanner;

class Main {
    int A, B, C, K;

    Main() {
        Scanner sc = new Scanner(System.in);
        this.A = Integer.parseInt(sc.next());
        this.B = Integer.parseInt(sc.next());
        this.C = Integer.parseInt(sc.next());
        this.K = Integer.parseInt(sc.next());
    }

    void solve() {
        int maxInt = A > B ? 
            (B > C ? A : (C > A ? C : A)) :
            (A > C ? B : (C > B ? C : B));

        int answer = maxInt * (int) Math.pow(2, K);
        if (maxInt == A) {
            answer += B + C;
        } else if (maxInt == B) {
            answer += C + A;
        } else {
            answer += A + B;
        }
        System.out.println(answer);
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.solve();
    }
}
