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
        long K = scanner.nextLong();

        long count1 = 0;
        long count2 = 0;
        for(int i = 1; i < S.length; i++) {
            if(S[i-1] == S[i] ) {
                if(i < S.length / 2) {
                    count1++;
                }else{
                    count2++;
                }
                S[i] = '_';
            }
        }

        long ans = (count1) + (count2 * (K - 1));

        System.out.println(ans);
    }
}