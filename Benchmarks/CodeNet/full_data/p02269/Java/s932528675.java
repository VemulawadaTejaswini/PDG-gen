import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Character> characters = Arrays.asList('A', 'C', 'G', 'T');
        List<String> commands = Arrays.asList("insert", "find");
        HashMap<String, List<String>> m = new HashMap<>();
        while(sc.hasNext()) {
            String[] c_s = sc.nextLine().split(" ");
            String c = c_s[0];
            String s = c_s[1];
            if (!commands.contains(c)) {
                return;
            }
            if (c.equals("insert")) {
                List<String> ss = m.get(s);
                if (ss == null) {
                    ss = new ArrayList<>();
                }
                ss.add(s);
                m.put(s, ss);
            }
            if (c.equals("find")) {
                List<String> ss = m.get(s);
                String y_n;
                if (ss == null) {
                    y_n = "no";
                } else if (ss.contains(s)) {
                    y_n = "yes";
                } else {
                    y_n = "no";
                }
                System.out.println(y_n);
            }
        }
    }
}


