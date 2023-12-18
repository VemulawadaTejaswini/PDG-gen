import java.util.*;

class Main {

    public static boolean isR(char x) {
        return x == 'r';
    }

    public static boolean isS(char x) {
        return x == 's';
    }

    public static boolean isP(char x) {
        return x == 'p';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int R = sc.nextInt();
        int S = sc.nextInt();
        int P = sc.nextInt();
        char[] history = new char[N];
        // rock:     r
        // scissors: s
        // paper:    p

        char[] T = sc.next().toCharArray();
        char[] W = new char[T.length];
        int maxscore = 0;
        int best_nr_r = 0;
        int best_nr_s = 0;
        int best_nr_p = 0;
        for (int i = 0; i < N; i++) {
            int t = T[i];
            if (t == 'r') {
                W[i] = 'p';
                best_nr_p += 1;
            } else if (t == 's') {
                W[i] = 'r';
                best_nr_r += 1;
            } else /* t == 'p' */ {
                W[i] = 's';
                best_nr_s += 1;
            }
        }
        maxscore = best_nr_r * R + best_nr_s * S + best_nr_p * P;

        //System.out.println(new String(W));
        //System.out.println(maxscore);
        // check restriction:

        boolean[] needcheck = new boolean[N];
        Arrays.fill(needcheck, false);
        for (int i = K; i < N; i++) {
            if (W[i - K] == W[i]) {
                needcheck[i] = true;
            }
        }

        for (int i = K; i < N; i++) {
            char w = W[i];
            //if (needcheck[i]) {
            //System.out.println(String.format("i-K,i %d, %d", i-K, i));
            if (W[i - K] == W[i]) {
                //System.out.println(String.format("A  %c %c", W[i-K], W[i]));
                if (w == 'r') {
                    best_nr_r -= 1;
                    // 's' or 'p'
                    if (i + K < N) {
                        //System.out.println("hoge");
                        if (isS(W[i + K])) {
                            W[i] =  'p';
                        } else {
                            // isR or isP
                            W[i] =  's';
                        }
                    } else {
                        //System.out.println("huga");
                    }
                } else if (w == 's') {
                    best_nr_s -= 1;
                    if (i + K < N) {
                        if (isR(W[i + K])) {
                            W[i] =  'p';
                        } else {
                            // isS or isP
                            W[i] =  'r';
                        }
                    }

                } else /* t == 'p' */ {
                    best_nr_p -= 1;
                    if (i + K < N) {
                        if (isR(W[i + K])) {
                            W[i] =  's';
                        } else {
                            // isS or isP
                            W[i] =  'r';
                        }
                    }
                }
                //System.out.println(String.format("A' %c %c", W[i-K], W[i]));
            } else {
                //System.out.println(String.format("B  %c %c", W[i-K], W[i]));
            }
        }
        maxscore = best_nr_r * R + best_nr_s * S + best_nr_p * P;
        //System.out.println(new String(W));
        System.out.println(maxscore);

    }
}
