import java.util.*;

public class Main {
    public static void main(String... a) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        String[] xys = input.split(" ");

        int N = Integer.parseInt(xys[0]);
        int K = Integer.parseInt(xys[1]);

        long cnt = 0;

        // System.out.println(N);
        // System.out.println(K);

        for (int i = 1; i <= N; i++) {
            List<Integer> jList = new ArrayList<>();
            for (int ii = 0; ; ++ii) {
                int j = K - i + ii * K;
                if (j <= 0) continue;
                if (j > N) break;

                jList.add(j);
            }

            for (int j : jList) {
                if ((i + j) % K != 0) {
                    continue;
                }

                List<Integer> kList1 = new ArrayList<>();
                for (int ii = 0; ; ++ii) {
                    int k = K - j + ii * K;
                    if (k <= 0) continue;
                    if (k > N) break;
                    kList1.add(k);
                }

                List<Integer> kList2 = new ArrayList<>();
                for (int ii = 0; ; ++ii) {
                    int k = K - i + ii * K;
                    if (k <= 0) continue;
                    if (k > N) break;
                    kList2.add(k);
                }

                List<Integer> kList = new ArrayList<>();
                for (int k1 : kList1) {
                    for (int k2 : kList2) {
                        if (k1 == k2) {
                            kList.add(k1);
                        }
                    }
                }

                // System.out.println("kList: " + kList);

                for (int k : kList) {
                    System.out.println(i + ", " + j + ", " + k);
                    if ((j + k) % K == 0 && (k + i) % K == 0) {
                        cnt++;
                        // System.out.println("t");
                    }
                }
            }
        }

        System.out.print(cnt);
    }
}
