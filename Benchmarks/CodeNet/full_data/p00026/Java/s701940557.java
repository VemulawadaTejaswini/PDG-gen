import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    /**
     * <p> [機能] 色のついていない部分のマス目の個数を第１行目に、１番濃いマス目の濃さを第２行目に出力。 </p>
     * <p> [説明] 特になし。</p>
     * <p> [備考] 特になし。</p>
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        BufferedReader stdReader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer[]> inputlist = new ArrayList<Integer[]>();

        String line;
        while ((line = stdReader.readLine()) != null) { // ユーザの一行入力を待つ
            // 空文字が入力されたら入力値の取得を終了する
            if (line.equals("")) {
                break;
            }
            StringTokenizer st = new StringTokenizer(line, ",");
            Integer[] input = new Integer[3];

            // 3つずつ配列に追加する
            int i = 0;
            while (st.hasMoreTokens()) {
                input[i] = Integer.valueOf(st.nextToken());
                i++;
            }
            // listに入力値の1行分を格納する。
            inputlist.add(input);
        }
        stdReader.close();

        // 10*10のフィールドを用意し、フィールド値を0とする。
        List<int[]> fields = new ArrayList<int[]>();
        for (int n = 0; n < 10; n++) {
            for (int m = 0; m < 10; m++) {
                int field[] = {n, m, 0};
                fields.add(field);
            }
        }

        // 増加させるフィールドを取得する
        List<int[]> addFields = new ArrayList<int[]>();
        for (Integer[] input : inputlist) {
            if (input[2] == 1) {
                addFields = doSize1(input[0], input[1]);
            } else if (input[2] == 2) {
                addFields = doSize2(input[0], input[1]);
            } else if (input[2] == 3) {
                addFields = doSize3(input[0], input[1]);
            }

            // フィールド値を増加させる
            for (int[] addField : addFields) {
                if ((addField[0] >= 0 && 9 >= addField[0]) && (addField[1] >= 0 && 9 >= addField[1])) {
                    for (int[] addedField : fields) {
                        if (addedField[0] == addField[0] && addedField[1] == addField[1]) {
                            addedField[2] = addedField[2] + 1;
                        }
                    }
                }
            }
        }

        // 値が0であるフィールドの個数と値の最大値を取得する。
        int zeroCount = 0;
        int maxNumber = 0;

        for (int[] checkField : fields) {
            if (checkField[2] == 0) {
                zeroCount = zeroCount + 1;
            }
            if (checkField[2] > maxNumber) {
                maxNumber = checkField[2];
            }
        }

        // 色のついていない部分のマス目の個数を第１行目に。１番濃いマス目の濃さを第２行目に出力する。
        System.out.println(zeroCount);
        System.out.println(maxNumber);
    }

    /**
     * <p> [機能] サイズ値が「小」の場合、対象となるフィールド値を返却する。</p>
     * <p> [説明] 特になし。</p>
     * <p> [備考] 特になし。</p>
     * @param x x座標の入力値
     * @param y y座標の入力値
     * @return
     */
    private static List<int[]> doSize1(int x, int y) {

        List<int[]> addFields = new ArrayList<int[]>();
        int[] intArray1 = {x, y};
        int[] intArray2 = {x + 1, y};
        int[] intArray3 = {x, y + 1};
        int[] intArray4 = {x, y - 1};
        int[] intArray5 = {x - 1, y};

        addFields.add(intArray1);
        addFields.add(intArray2);
        addFields.add(intArray3);
        addFields.add(intArray4);
        addFields.add(intArray5);

        return addFields;

    }

    /**
     * <p> [機能] サイズ値が「中」の場合、対象となるフィールド値を返却する。</p>
     * <p> [説明] 特になし。</p>
     * <p> [備考] 特になし。</p>
     * @param x x座標の入力値
     * @param y y座標の入力値
     * @return
     */
    private static List<int[]> doSize2(int x, int y) {
        List<int[]> addFields = new ArrayList<int[]>();
        int[] intArray1 = {x + 1, y + 1};
        int[] intArray2 = {x + 1, y - 1};
        int[] intArray3 = {x - 1, y + 1};
        int[] intArray4 = {x - 1, y - 1};

        addFields = doSize1(x, y);
        addFields.add(intArray1);
        addFields.add(intArray2);
        addFields.add(intArray3);
        addFields.add(intArray4);

        return addFields;
    }

    /**
     * <p> [機能] サイズ値が「大」の場合、対象となるフィールド値を返却する。</p>
     * <p> [説明] 特になし。</p>
     * <p> [備考] 特になし。</p>
     * @param x x座標の入力値
     * @param y y座標の入力値
     * @return
     */
    private static List<int[]> doSize3(int x, int y) {
        List<int[]> addFields = new ArrayList<int[]>();
        int[] intArray1 = {x + 2, y};
        int[] intArray2 = {x - 2, y};
        int[] intArray3 = {x, y + 2};
        int[] intArray4 = {x, y - 2};

        addFields = doSize2(x, y);
        addFields.add(intArray1);
        addFields.add(intArray2);
        addFields.add(intArray3);
        addFields.add(intArray4);

        return addFields;
    }
}