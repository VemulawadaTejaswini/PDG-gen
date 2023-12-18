import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        c();
    }
    private static void c() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] as = new long[n];
        for (int i = 0; i < n; i++) {
            as[i] = sc.nextLong();
        }

        Arrays.sort(as);

        boolean flag = true;
        long bc = 0;
        while(flag) {
            long fc = bc;

            long hscore = bc;
            int h_i = 0;
            int h_j = 0;
            for (int i = 0; i < n - 1; i++) {
                for(int j = i + 1; j < n; j++) {
                    swap(as, i,j);
                    long nc = score(as);
                    if (nc > hscore) {
                        hscore = nc;
                        h_i = i;
                        h_j = j;
                    }
                    swap(as, i,j);
                }
            }

            swap(as,h_i,h_j);
            long s = score(as);
            if (s == fc) {
                flag = false;
            } else {
                bc = s;
            }
        }

        System.out.println(bc);

    }

    private static long score(long[] as) {
        long c = 0;
        for (int i = 0; i < as.length - 1; i++) {
            c += Math.abs(as[i] - as[i+1]);
        }

        return c;
    }

    private static void swap(long[] as, int i,int j) {
        long wk = as[i];
        as[i] = as[j];
        as[j] = wk;
    }
    }