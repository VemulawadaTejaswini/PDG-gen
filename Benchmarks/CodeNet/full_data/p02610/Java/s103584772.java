import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    class Camel {
        int K, L, R;

        public Camel(int k, int l, int r) {
            K = k;
            L = l;
            R = r;
        }
    }

    public Main() {
        ArrayList<Camel> lefterList  = new ArrayList<>(200000); //L >= Rのcamel集合
        ArrayList<Camel> righterList = new ArrayList<>(200000); //R <  Lのcamel集合
        ArrayList<Camel> closeList   = new ArrayList<>(200000); //走査用の集合

        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt();
            long result = 0L;

            //リストの初期化
            lefterList.clear();
            righterList.clear();

            for (int j = 0; j < N; j++) {
                int K = scanner.nextInt();
                int L = scanner.nextInt();
                int R = scanner.nextInt();

                //分類
                if (L >= R) {
                    lefterList.add(new Camel(K, L, R));
                } else {
                    righterList.add(new Camel(K, L, R));
                }
            }

            //サイズの記憶
            int lefterSize = lefterList.size();

            //Kを基準に昇順にソート
            lefterList.sort((a, b) -> a.K - b.K);

            closeList.clear();
            for (int index = 1; index <= N; index++) {

                while (!lefterList.isEmpty()) {
                    Camel C = lefterList.get(0);
                    if (C.K != index) break;
                    closeList.add(C);
                    lefterList.remove(C);
                }

                if (closeList.size() > index) {
                    closeList.sort((a, b) -> (a.L - a.R) - (b.L - b.R));
                    while (closeList.size() > index) {
                        Camel C = closeList.get(0);
                        closeList.remove(C);
                        result += C.R;
                    }
                }
            }

            for (Camel c : closeList) {
                result += c.L;
            }

            righterList.sort((a, b) -> b.K - a.K);

            closeList.clear();
            for (int index = N; index > 1; index--) {

                while (!righterList.isEmpty()) {
                    Camel C = righterList.get(0);
                    if (C.K >= index){
                        result += C.L;
                        righterList.remove(C);
                    } else if (C.K != index-1){
                        break;
                    } else {
                        closeList.add(C);
                        righterList.remove(C);
                    }
                }

                if (closeList.size() > Math.min(N - index + 1, N - lefterSize)) {
                    closeList.sort((a, b) -> (a.R - a.L) - (b.R - b.L));
                    while (closeList.size() > Math.min(N - index + 1, N - lefterSize)) {
                        Camel C = closeList.get(0);
                        closeList.remove(C);
                        result += C.L;
                    }
                }
            }

            for (Camel c : closeList){
                result += c.R;
            }

            System.out.println(result);
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
