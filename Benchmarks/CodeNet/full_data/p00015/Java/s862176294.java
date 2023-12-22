import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Main {

    // 本プログラムで扱える最大の桁数(80桁)
    private static final int LIMIT_NUM = 80;

    public static void main(String[] args) {
        List<String> inputDataList = new LinkedList<String>();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String input = null;

        try {
            while ((input = in.readLine()) != null) {
                inputDataList.add(input);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        parseBudget(inputDataList);
    }

    private static void parseBudget(List<String> inputDataList) {
        int cnt = Integer.parseInt(inputDataList.get(0));

        for (int i = 0; i < cnt; i++) {

            // リストの最大長以上の参照防止
            if (inputDataList.size() < i * 2 + 2) {
                break;
            }

            StringBuilder first = new StringBuilder();
            first.append(inputDataList.get(i * 2 + 1));

            StringBuilder second = new StringBuilder();
            second.append(inputDataList.get(i * 2 + 2));

            printBudget(first.reverse(), second.reverse());
        }
    }

    private static void printBudget(StringBuilder first, StringBuilder second) {

        // スタートの桁数超過ならば最初にはじく
        if (first.length() > LIMIT_NUM || second.length() > LIMIT_NUM) {
            System.out.println("overflow");
            return;
        }

        int[] budget = new int[LIMIT_NUM];

        for (int i = 0; i < first.length() || i < second.length(); i++) {
            if (i < first.length()) {
                budget[i] = budget[i]
                        + Integer.parseInt(first.substring(i, i + 1));
            }

            if (i < second.length()) {
                budget[i] = budget[i]
                        + Integer.parseInt(second.substring(i, i + 1));
            }

            if (budget[i] > 9) {
                if (i >= LIMIT_NUM - 1) {
                    System.out.println("overflow");
                    return;
                } else {
                    budget[i + 1] = budget[i + 1] + budget[i] / 10;
                    budget[i] = budget[i] % 10;
                }

            }
        }

        boolean isNotStart = true;
        StringBuilder budgetStr = new StringBuilder();

        for (int j = budget.length - 1; j >= 0; j--) {

            if (isNotStart && budget[j] == 0) {
                continue;
            }

            isNotStart = false;
            budgetStr.append(budget[j]);
        }

        System.out.println(budgetStr.toString());
    }
}