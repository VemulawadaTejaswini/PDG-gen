import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        int max = Math.min(A,B);
        int min = Math.max(A + B - N, 0);

        out.println(max+" "+min);
    }
}