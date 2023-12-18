import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        String SS = scanner.next();
        SS = SS + SS;
        char[] S = SS.toCharArray();
        char[] F = SS.toCharArray();
        long K = scanner.nextLong();

        long count1 = 0;
        long count2 = 0;
        long edge = 1;
        char e = S[0];
        for(int i = 1; i < S.length; i++) {
            if(e != S[i]) edge = 0;
            if(S[i-1] == S[i] ) {
                if(i < S.length / 2) {
                    count1++;
                }else{
                    count2++;
                }
                S[i] = '_';
            }
        }

        long ans;
        if(edge == 1) {
            ans = (count1 * ((K / 2) + K % 2)) + (count2 * (K / 2));
        } else {
            ans = (count1) + (count2 * (K - 1));
        }


        System.out.println(ans);
    }
}
