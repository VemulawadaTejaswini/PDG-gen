import java.util.*;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Long,Long> w = new HashMap<>(n);
        for( int i=0; i<n; i++) {
            Long a = sc.nextLong();
            Long b = sc.nextLong();
            if( w.containsKey(b) ) {
                a += w.get(b);
            }
            w.put(b,a);
        }
        n = w.size();
        //
        List<Entry<Long,Long>> en = new ArrayList<>(w.entrySet());
        Collections.sort(en, new Comparator<Entry<Long, Long>>() {
            @Override
            public int compare(Entry<Long, Long> e1, Entry<Long, Long> e2) {
                return (e1.getKey()).compareTo(e2.getKey());
            }
        });
        //
        String ans = "Yes";
        long check = 0;
        for( Entry<Long,Long> e : en ) {
            check += e.getValue();
            if( check > e.getKey() ) {
                ans = "No";
                break;
            }
        }
        System.out.println(ans);
    }

}