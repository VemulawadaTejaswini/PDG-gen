import java.io.PrintWriter;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = Integer.parseInt(sc.next());
        Map<Character, Integer> m = new HashMap<Character, Integer>();
        m.put('A', Integer.parseInt(sc.next()));
        m.put('B', Integer.parseInt(sc.next()));
        m.put('C', Integer.parseInt(sc.next()));
        String[] s = new String[n];
        for (int i = 0; i < n; i++) s[i] = sc.next();
        List<Character> r = new ArrayList<Character>();
        for (int i = 0; i < n - 1; i++) {
            char a = s[i].charAt(0);
            char b = s[i].charAt(1);
            if (m.get(a) == 0 || m.get(b) == 0) {
                if (m.get(a) == 0) {
                    m.put(a, m.get(a) + 1);
                    m.put(b, m.get(b) - 1);
                    r.add(a);
                }
                else {
                    m.put(a, m.get(a) - 1);
                    m.put(b, m.get(b) + 1);
                    r.add(b);
                }
            }
            else {
                if (s[i + 1].indexOf(a) > -1) {
                    m.put(a, m.get(a) + 1);
                    m.put(b, m.get(b) - 1);
                    r.add(a);
                }
                else{
                    m.put(a, m.get(a) - 1);
                    m.put(b, m.get(b) + 1);
                    r.add(b);
                }
            }
        }
        char a = s[n - 1].charAt(0);
        char b = s[n - 1].charAt(1);
        if (m.get(a) == 0 || m.get(b) == 0) {
            if (m.get(a) == 0) {
                m.put(a, m.get(a) + 1);
                m.put(b, m.get(b) - 1);
                r.add(a);
            }
            else {
                m.put(a, m.get(a) - 1);
                m.put(b, m.get(b) + 1);
                r.add(b);
            }
        }
        for (Integer i : m.values()) {
            if (i < 0) {
                out.println("No");
                out.flush();
                return;
            }
        }
        out.println("Yes");
        for (Character i : r) {
            out.println(i);
        }
        out.flush();
    }
}