import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner s = new Scanner(System.in);

        Map<String, String> m = new HashMap<>();


        while (true) {

            int n = s.nextInt();

            if(n == 0) break;

            for (int i = 0; i < n; i++) {
                m.put(s.next(), s.next());
            }

            String r = "";
            n = s.nextInt();
            for (int i = 0; i < n; i++) {
                String str = s.next();
                r += m.containsKey(str) ? m.get(str) : str;
            }
            System.out.println(r);
        }


    }

}