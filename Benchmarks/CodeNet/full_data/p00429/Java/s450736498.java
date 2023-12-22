import java.util.*;
import java.text.*;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static LinkedList<Pair> list;
    public static void main(String[] args) throws Exception {
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n == 0) break;
            String s = sc.next();
            for (int i = 0; i < n; i++) {
                list = new LinkedList<>();
                for (int j = 0; j < s.length(); j++) {
                    String c = s.substring(j, j+1);
                    if (!list.isEmpty()) {
                        Pair p = list.getLast();
                        if (!p.s.equals(c)) {
                            list.add(new Pair(c, 1));
                        } else {
                            list.getLast().i++;
                        }
                    } else {
                        list.add(new Pair(c, 1));
                    }
                }
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < list.size(); j++) {
                    Pair p = list.get(j);
                    sb.append(p.i).append(p.s);
                }
                s = sb.toString();
            }
            System.out.println(s);
        }
    }
}

class Pair {
    public String s;
    public int i;
    public Pair(String s, int i) {
        this.s = s;
        this.i = i;
    }
}