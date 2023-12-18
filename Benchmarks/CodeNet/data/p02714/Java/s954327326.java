import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] S = sc.next().toCharArray();
        long r = 0, g = 0, b = 0;
        for(char c : S) {
            if(c == 'R') r++;
            else if(c == 'G') g++;
            else b++;
        }
        long ans = r * b * g;
        for(int i = 0; i < n; i++) {
            for(int j = 1; j + i < n; j++) {
                    if(i - j >= 0 &&
                            S[i]   != S[i+j] &&
                            S[i]   != S[i-j] &&
                            S[i+j] != S[i-j]) ans--;
            }
        }
        System.out.println(ans);
    }
}
