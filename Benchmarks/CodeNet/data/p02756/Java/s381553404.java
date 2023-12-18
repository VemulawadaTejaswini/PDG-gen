import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String S = s.next();
        int Q = Integer.parseInt(s.next());
        StringBuilder sb = new StringBuilder(S);
        StringBuilder sbF = new StringBuilder();
        StringBuilder sbB = new StringBuilder();
        boolean reversed = false;
        for (int i = 0; i < Q; i++) {
            // 反転
            if (s.nextInt() == 1) {
                reversed = !reversed;
                continue;
            }
            // 文字追加
            int F = s.nextInt();
            String C = s.next();
            // 先頭に追加
            if (F == 1) {
                if (reversed) {
                    // 反転されている場合は末尾追加
                    sbB.append(C);
                    continue;
                }
                sbF.append(C);
                continue;
            }
            if (reversed) {
                // 反転されている場合は先頭追加
                sbF.append(C);
                continue;
            }
            // 末尾に追加
            sbB.append(C);
        }

        if (reversed) {
            System.out.print(sbB.reverse());
            System.out.print(sb.reverse());
            System.out.println(sbF);
        } else {
            System.out.print(sbF.reverse());
            System.out.print(sb);
            System.out.println(sbB);
        }
    }
}