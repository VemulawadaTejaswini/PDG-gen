import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] S = sc.next().toCharArray();
        String acgt = "ACGT";
        int ans = 0;
        for(int i = 0; i < S.length; i++) {
            int c = 0;
            for(int j = i; j < S.length; j++) {
                if(acgt.indexOf(S[j]) == -1) break;
                c++;
            }
            ans = Math.max(ans, c);
        }
        System.out.println(ans);
    }
}
