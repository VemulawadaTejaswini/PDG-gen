import java.util.*;

public class Main {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();
        final String A = sc.next();
        sc.close();
        int[] n1 = new int[N];
        int[] n2 = new int[N];
        boolean f = true;

        for (int i = 0; i < N; i++) {
            n1[i] = A.charAt(i) - '0';
        }
        for (int i = 1; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i + j < N) {
                    if (f) {
                        n2[j] = n1[j] - n1[j + 1];
                        if (n2[j] < 0)
                            n2[j] *= -1;
                        f = false;
                    }else{
                        n1[j] = n2[j] - n2[j + 1];
                        if (n1[j] < 0)
                            n1[j] *= -1;
                        f = true;
                    }
                }else   
                    break;
            }
        }
        if(f)
            System.out.println(n2[0]);
        else
            System.out.println(n1[0]);
    }
}