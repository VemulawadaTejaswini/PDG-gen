import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static final String OVER_FLOW = "overflow";
    private static final String STRING_ZERO = "0";
    private static final int MAX_NUM = 100000000;

    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;

        try {
            count = Integer.valueOf(in.readLine());

            for (int i = 0; i < count; i++) {

                int[] budget = new int[10];
                String input1 = in.readLine();
                String input2 = in.readLine();

                if(input1.length() > 80 || input2.length() > 80) {
                    System.out.println(OVER_FLOW);
                    continue;
                }

                int idx = 0;
                for (int j = input1.length(); j > 0; j -= 8) {

                    budget[idx] = Integer.valueOf(input1.substring(
                            j - 8 > 0 ? j - 8 : 0, j));
                    idx++;
                }

                idx = 0;

                for (int k = input2.length(); k > 0; k -= 8) {

                    budget[idx] += Integer.valueOf(input2.substring(
                            k - 8 > 0 ? k - 8 : 0, k));
                    idx++;
                }

                for (int l = 0; l < 9; l++) {
                    if (budget[l] >= MAX_NUM) {
                        budget[l + 1] += 1;
                        budget[l] -= MAX_NUM;
                    }
                }

                if (budget[9] >= MAX_NUM) {
                    System.out.println(OVER_FLOW);
                } else {

                    boolean startFlg = false;

                    StringBuilder result = new StringBuilder();

                    for (int m = 9; m >= 0; m--) {

                        if (startFlg) {

                            String tmp = String.valueOf(budget[m]);

                            for (int n = 8 - tmp.length(); n > 0; n--) {
                                result.append(STRING_ZERO);
                            }
                            result.append(tmp);
                        } else if (budget[m] > 0 || m == 0) {
                            result.append(budget[m]);
                            startFlg = true;
                        }
                    }

                    System.out.println(result.toString());
                }
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
    }
}