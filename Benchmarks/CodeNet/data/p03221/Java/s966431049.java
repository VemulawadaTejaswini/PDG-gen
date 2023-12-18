import java.io.PrintWriter;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        Map<Integer, Integer> hpf = new TreeMap<>();
        Map<Integer, Integer> hid = new TreeMap<>();
        Map<Integer, Integer> hyy = new TreeMap<>();
        for (int i = 0; i < m; i++) {
            int Pref = Integer.parseInt(sc.next());
            int Year = Integer.parseInt(sc.next());
            hyy.put(Year, Pref);
            hid.put(Year, i);
            hpf.put(Pref, 0);
        }
        sc.close();
        String ans[] = new String[m];
        for (int key : hyy.keySet()) {
            hpf.put(hyy.get(key), hpf.get(hyy.get(key)) + 1);
            ans[hid.get(key)] = String.format("%06d", hyy.get(key)) + String.format("%06d", hpf.get(hyy.get(key)));
        }
        PrintWriter pw = new PrintWriter(System.out);
        for (int i = 0; i < m; i++) {
            pw.println(ans[i]);
        }
        pw.flush();
    }
}