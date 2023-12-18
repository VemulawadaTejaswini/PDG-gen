import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int N = stdIn.nextInt();
        String S = stdIn.next();
        stdIn.close();
        
        int count = 0;
        for (int i = 0; i <= N - 3; i++) {
            for (int j = i + 1; j <= N - 2; j ++) {
                for (int k = j + 1; k <= N - 1; k++) {
                    if ((S.charAt(i) != S.charAt(j)) && (S.charAt(i) != S.charAt(k))) {
                        if ((S.charAt(i) != S.charAt(k)) && (S.charAt(j) != S.charAt(k))) {
                            if (j - i != k - j) {
                                count++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}