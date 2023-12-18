import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0; i<n; i++) {
            a.add(sc.nextInt());
        }

        ArrayList<Integer> na = new ArrayList<>();
        for(int i=0; i<a.size(); i++) {
            na.add(a.get(i)+1);
            na.add(a.get(i)-1);
            na.add(a.get(i));
        }

        Set<Integer> s = new HashSet<>(na);
        Map<Integer,Integer> m = new HashMap<>();

        for(int i: s) {
            m.put(i, Collections.frequency(na,i));
        }

        int ans = 0;
        for(int i: m.keySet()) {
            //System.out.println("i: " + i + " m.get(i): " + m.get(i));
            ans = Math.max(ans, m.get(i));
        }
        System.out.println(ans);
    }
}
