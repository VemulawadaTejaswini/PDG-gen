import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] tmp = br.readLine().split(" ");
        int n = Integer.parseInt(tmp[0]);
        int k = Integer.parseInt(tmp[1]);
        char[] s = br.readLine().toCharArray();

        List<Integer> list = new ArrayList<>();
        boolean b = true;
        int i;
        int count = 0;
        for(i = 0; i < n; i++) {
            if(b != (s[i] == '1')) {
                list.add(count);
                count = 1;
                b = !b;
            }else {
                count++;
            }
        }
        list.add(count);
        if(list.size() % 2 == 0) list.add(0);


        int ans = 0;
        int j = 0;
        do {
            int y = 0;
            for(int x = 2 * j; x < list.size() && x <= 2 * j + 2 * k; x++) {
                y += list.get(x);
            }
            j++;
            ans = Math.max(ans, y);
        }while(j < list.size() / 2);

        System.out.println(ans);
    }
}