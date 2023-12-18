import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N;// = scan.nextInt();
        String S0;// = scan.next();

        N = 6;
        S0 = "123123";

        int[] S = new int[S0.length()];

        boolean[] a = new boolean[1000];

        for (int i = 0; i < S0.length(); i++) { S[i] = S0.charAt(i) - '0'; }

        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                for (int k = j+1; k < N; k++) {
                    //System.out.println("" + S[i] + S[j] + S[k]);
                    a[S[i]*100+S[j]*10+S[k]] = true;
                }
            }
        }

        int ans = 0;
        for (int i = 0; i < 1000; i++) {
            if (a[i]) ans++;
        }

        System.out.println(ans);

    }

}
