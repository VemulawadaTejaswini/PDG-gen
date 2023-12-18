import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        char[] S = sc.next().toCharArray();
        char[] T = sc.next().toCharArray();

        int[] start = new int[S.length];
        int[] end = new int[S.length];

        Arrays.fill(start, -1);
        Arrays.fill(end, -1);

        for (int i = 0; i < S.length; i++) {
            if (S[i] != T[i]) {
                int a = S[i] - 'a';
                int b = T[i] - 'a';

                if ((start[a] != -1 && end[b] != a) || (end[b] != -1 && start[a] != b)) {
                    System.out.println("No");
                }
                start[a] = b;
                end[b] = a;
            }
        }
        System.out.println("Yes");
    }


}
