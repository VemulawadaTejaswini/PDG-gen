import java.util.ArrayList;
import java.util.List;
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
        int T = Integer.valueOf(scanner.next());
        for (int i = 0; i < T; i++) {
            int N = Integer.valueOf(scanner.next());
            long result = 0L;

            //リストの初期化
            lefterList.clear();
            righterList.clear();

            for (int j = 0; j < N; j++) {
                int K = Integer.valueOf(scanner.next());
                int L = Integer.valueOf(scanner.next());
                int R = Integer.valueOf(scanner.next());

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
                if (lefterList.isEmpty()) break;

                int to = 0;
                while(to < lefterList.size() && lefterList.get(to).K == index) to++;
                if (to == 0) continue;
                closeList.addAll(lefterList.subList(0, to));
                lefterList.subList(0, to).clear();

                if (closeList.size() > index) {
                    closeList.sort((a, b) -> (a.L - a.R) - (b.L - b.R));

                    int toIndex = closeList.size() - index;

                    for (Camel c : closeList.subList(0, toIndex)) {
                        result += c.R;
                    }

                    closeList.subList(0, toIndex).clear();
                }
            }

            for (Camel c : closeList) {
                result += c.L;
            }

            righterList.sort((a, b) -> b.K - a.K);

            while (!righterList.isEmpty()){
                Camel c = righterList.get(0);
                if(c.K == N){
                    result += c.L;
                    righterList.remove(c);
                } else {
                    break;
                }
            }

            closeList.clear();
            for (int index = N; index > 1; index--) {

                while (!righterList.isEmpty()) {
                    Camel C = righterList.get(0);
                    if (C.K != index-1) break;

                    closeList.add(C);
                    righterList.remove(C);
                }

                int size = Math.min(N - index + 1, N - lefterSize);
                if (closeList.size() > size) {
                    closeList.sort((a, b) -> (a.R - a.L) - (b.R - b.L));

                    int toIndex = closeList.size() - size;

                    for (Camel c : closeList.subList(0, toIndex)) {
                        result += c.L;
                    }

                    closeList.subList(0, toIndex).clear();
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
