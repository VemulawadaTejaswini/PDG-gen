import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static final String BLANK = " ";

    private static final String ANSWER_YES = "YES";

    private static final String ANSWER_NO = "NO";

    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;

        try {
            count = Integer.valueOf(in.readLine());

            for (int i = 0; i < count; i++) {

                String[] dataArray = in.readLine().split(BLANK);

                if (drop(dataArray)) {
                    System.out.println(ANSWER_YES);
                } else {
                    System.out.println(ANSWER_NO);
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

    private static boolean drop(String[] dataArray) {

        int max = 0;
        int min = 0;

        for (String data : dataArray) {
            int num = Integer.valueOf(data);

            if (num > max) {
                max = num;
            } else if (num > min) {
                min = num;
            } else {
                return false;
            }
        }

        return true;
    }
}