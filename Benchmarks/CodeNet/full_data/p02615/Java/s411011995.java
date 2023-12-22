import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int Num = Integer.parseInt(reader.readLine());
            String[] Friendstr = reader.readLine().split(" ");

            Integer[] Friend = new Integer[Num];
            for (int i = 0; i < Friendstr.length; i++) {
                Friend[i] = Integer.parseInt(Friendstr[i]);
            }
            Arrays.sort(Friend, Collections.reverseOrder());

            List<Integer> entry = new ArrayList<Integer>();

            int comfort = 0; // 心地よさ

            // 降順にソートされたでfiの行列を処理する
            for (int i = 0; i < Friend.length; i++) {
                // 一人目の処理
                if (i == 0) {
                    entry.add(Friend[i]);
                    continue;
                }
                // 二人目の処理
                if (i == 1) {
                    entry.add(Friend[i]);
                    comfort = entry.get(0);
                    continue;
                }
                int tmpindex = 0; // 挿入予定箇所の添え字候補
                int tmpmax = 0; // 心地よさ追加候補値
                // 現時点でのエントリーリストを順に処理する
                for (int j = 0; j < entry.size(); j++) {
                    int jnext = j + 1;
                    if (j == entry.size() - 1) {
                        jnext = 0;
                    }
                    if (entry.get(j) >= entry.get(jnext)) {
                        if (tmpmax < entry.get(jnext)) {
                            tmpmax = entry.get(jnext);
                            tmpindex = j + 1;
                        }
                    } else {
                        if (tmpmax < entry.get(j)) {
                            tmpmax = entry.get(j);
                            tmpindex = j + 1;
                        }
                    }
                }
                entry.add(tmpindex, Friend[i]);
                comfort += tmpmax;
            }

            System.out.println(comfort);
            reader.close();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

    }

}