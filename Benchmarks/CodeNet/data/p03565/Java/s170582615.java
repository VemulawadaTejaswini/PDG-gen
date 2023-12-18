import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int slen = s.length();
        int tlen = t.length();
        boolean ok = false;
        // 辞書順で初め => 後ろに一致するものを探す
        char ft = t.charAt(0);// tの最初の文字
        for (int i = 0; i < slen; i++) {
            char c = s.charAt(slen - 1 - i); // sの文字取得 後ろから取っていく
            // System.out.println(c);
            if (c == ft || c == '?') {
                // 一文字目が取れたので全部一致するか試す
                int cnt = 0;
                for (int j = 0; j < tlen; j++) {
                    if (slen - 1 - i + j >= slen)
                        break;
                    // System.out.println((slen - 1 - i) + " : " + j);
                    c = s.charAt(slen - 1 - i + j);
                    char tc = t.charAt(j);
                    // System.out.println(c + " : " + tc);
                    if (c != tc && c != '?')
                        break;
                    cnt++;
                }
                if (cnt == tlen) {
                    ok = true;
                    for (int j = 0; j < tlen; j++) {
                        char tc = t.charAt(j);
                        // 結合する
                        s = s.substring(0, slen - 1 - i + j) + tc + s.substring(slen - 1 - i + j + 1);
                    }
                }
            }
        }

        if (ok) {
            for (int i = 0; i < slen; i++) {
                char ans = s.charAt(i);
                if (ans == '?') {
                    System.out.print('a');
                } else {
                    System.out.print(ans);
                }

            }
            System.out.println("");
        } else {
            System.out.println("UNRESTORABLE");
        }
        sc.close();
    }
}
