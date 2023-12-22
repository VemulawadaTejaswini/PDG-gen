import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    public void run() {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        char[] S = sc.next().toCharArray();

        StringBuilder sb = new StringBuilder();
        if (S.length<=K) {
            sb.append(S);
        } else {
            for (int i = 0; i <K; i++) {
                sb.append(S[i]);
            }
            sb.append("...");
        }


        System.out.println(sb.toString());
        return;
    }

}