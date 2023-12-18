import java.util.*;

public class Main {

    private int N;
    private String[] S;

    public void inputData() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        S = new String[N];
        for (int i = 0; i < N; i++) {
            S[i] = sc.next();
        }
    }

    public boolean isInitial(String str) {
        return (str.charAt(0) == 'M' || str.charAt(0) == 'A' || str.charAt(0) == 'R' || str.charAt(0) == 'C' || str.charAt(0) == 'H');
    }

    public void printAnswer() {
        long count = 0;
        for (int i = 0; i < N - 2; i++) {
            for (int j = i; j < N - 1; j++) {
                for (int k = j; k < N; k++) {
                    if (isInitial(S[i]) && isInitial(S[j]) && isInitial(S[k])
                    && S[i].charAt(0) != S[j].charAt(0) && S[j].charAt(0) != S[k].charAt(0) && S[k].charAt(0) != S[i].charAt(0)) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }

    public void run() {
        inputData();
        printAnswer();
    }

    public static void main(String[] args) {
        (new Main()).run();
    }

}
