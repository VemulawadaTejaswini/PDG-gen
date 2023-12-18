import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        Map<Integer, List<Arbeit>> queue = new HashMap<>();
        for(int i=0; i<n; i++) {
            Arbeit ar = new Arbeit();
            ar.a = in.nextInt();
            ar.b = in.nextInt();
            List<Arbeit> array = null;
            if(queue.containsKey(ar.a)) {
                array = queue.get(ar.a);
            }
            else {
                array = new ArrayList<>();
            }
            array.add(ar);
            queue.put(ar.a, array);
        }
        SortedMap<Integer, List<Arbeit>> pool = new TreeMap<>();
        long result = 0;
        for(int i=1; i<=m; i++) {
            List<Arbeit> array = queue.get(i);
            if(array != null) {
                for(int j=0; j<array.size(); j++) {
                    Arbeit ar = array.get(j);
                    if(pool.containsKey(ar.b)) {
                        List<Arbeit> list = pool.get(ar.b);
                        list.add(ar);
                    }
                    else {
                        List<Arbeit> list = new ArrayList<>();
                        list.add(ar);
                        pool.put(ar.b, list);
                    }
                }
            }
            if(!pool.isEmpty()) {
                int lastKey = pool.lastKey();
                List<Arbeit> list = pool.get(lastKey);
                result += list.get(0).b;
                list.remove(0);
                if(list.isEmpty()) {
                    pool.remove(lastKey);
                }
            }
        }
        System.out.println(result);
    }
}
class Arbeit implements Comparable<Arbeit> {
    int a;
    int b;
    public static Arbeit getDummy() {
        Arbeit a = new Arbeit();
        a.a = Integer.MAX_VALUE;
        a.b = -100;
        return a;
    }
    public boolean isDummy() {
        return (this.a == Integer.MAX_VALUE && this.b == -100);
    }
    public void turnIntoDummy() {
        this.a = Integer.MAX_VALUE;
        this.b = -100;
    }

    @Override
    public int compareTo(Arbeit o) {
        return o.b - this.b;
    }
}
