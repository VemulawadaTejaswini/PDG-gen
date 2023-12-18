import java.util.*;

public class Main {
    static long MOD = 109+7;

    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> p = new ArrayList<>();
        for(int i = 0 ; i < n; i++) {
            p.add(sc.nextInt());
        }

        LinkedList<Integer> q = new LinkedList<>();

        while(p.size() > 0) {
            int id = 0;
            int former = p.get(0);
            int latter = p.get(1);
            int min = Math.min(former, latter);
            int max = Math.max(former, latter);

            for(int i = 1; i < p.size() - 1; i++) {
                int _former = p.get(i);
                int _latter = p.get(i + 1);
                int _min = Math.min(_former, _latter);
                int _max = Math.max(_former, _latter);
                boolean change = false;
                if(min < _min) {
                    change = true;
                } else if(min == _min) {
                    if(max < _max) {
                        change = true;
                    } else if(max == _max) {
                        if(former > _former) {
                            change = true;
                        }
                    }
                }

                if(change) {
                    id = i;
                    former = _former;
                    latter = _latter;
                    min = _min;
                    max = _max;
                }
            }

            q.addFirst(p.remove(id + 1));
            q.addFirst(p.remove(id));
        }

        Iterator<Integer> iterator = q.iterator();
        System.out.print(iterator.next());
        while(iterator.hasNext()) {
            System.out.print(" " + iterator.next());
        }
        System.out.println();
    }
}