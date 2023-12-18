import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        String S = sc.next();
        String[] mas = new String[N];
        Integer[] x = new Integer[N];
        for (int i=0; i<N; i++) {
            mas[i] = String.valueOf(S.charAt(i));
            x[i] = 1;
        }
        String[] t = new String[Q];
        String[] d = new String[Q];
        for (int i=0; i<Q; i++) {
            t[i] = sc.next();
            d[i] = sc.next();
        }
        for (int i=0; i<Q; i++) {
            for (int j=0; j<N; j++) {
                if (mas[j].equals(t[i])) {
                    if ("L".equals(d[i])) {
                        if (j > 0) {
                            x[j-1] += x[j];
                        }
                    } else {
                        if (j < N - 1){
                            x[j+1] += x[j];
                        }
                    }
                    x[j] = 0;
                }
            }
        }
        int cnt = 0;
        for (int i=0; i<N; i++) {
            cnt += x[i];
        }

        System.out.println(cnt);
    }
}
