import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String S[] = new String[N];
        for (int i = 0; i < N; i++) {
            S[i] = scan.next();
        }

        Arrays.sort(S);
        System.out.println(Arrays.toString(S));
        int count = 1;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (S[i].equals(S[j])) {
                    continue;
                } else {
                    count++;
                    i = j - 1;
                    break;
                }
            }
        }

        System.out.println(count);
        scan.close();
    }
}