import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        try {
            String line;
            line = br.readLine();
            st = new StringTokenizer(line);
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < 5 ; i++) {
                list.add(Integer.parseInt(st.nextToken()));
            }
            // 手抜き
            Collections.sort(list);
            Collections.reverse(list);
            for (Integer integer : list) {
                sb.append(integer).append(" ");
            }
            System.out.println(sb.toString().trim());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}