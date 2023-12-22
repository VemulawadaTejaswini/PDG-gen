import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);

        Integer num = Integer.parseInt(br.readLine());

        String str;

        String[] sp = null;
        if ((str = br.readLine()) != null) {
            sp = str.split(" ");
        }

        List<String> list = new ArrayList<String>(Arrays.asList(sp));

        int cnt = 0;
        String temp = null;
        for (int i = 1; i < num; i++) {

            temp = list.get(i - 1);
            if (Integer.parseInt(temp) > Integer.parseInt(list.get(i))) {
                list.remove(i - 1);
                list.add(temp);
                cnt++;
                i = 0;
            }
        }
        System.out.println(cnt);
    }
}