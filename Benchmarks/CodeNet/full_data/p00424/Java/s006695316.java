import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner s = new Scanner(System.in);

        while (true) {

            int n = s.nextInt();

            if(n == 0) break;

            Map<String, String> m = new HashMap<String, String>(n);
            for (int i = 0; i < n; i++) {
                m.put(s.next(), s.next());
            }

            n = s.nextInt();
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < n; i++) {
                String str = s.next();
                sb.append(m.containsKey(str) ? m.get(str) : str);
            }
            System.out.println(sb.toString());
        }


    }

}