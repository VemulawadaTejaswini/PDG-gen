import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeSet<Num> set = new TreeSet<>();
        set.add(new Num(0, -1));
        for (int i = 0; i < n; i++) {
            Num y = new Num(sc.nextInt(), i);
            Num next = set.lower(y);
            if (next.value != 0 && next.idx != -1) {
                set.remove(next);
            }
            set.add(y);
        }
        System.out.println(set.size() - 1);
    }
    
    static class Num implements Comparable<Num> {
        int idx;
        int value;
        
        public Num(int value, int idx) {
            this.idx = idx;
            this.value = value;
        }
        
        public int hashCode() {
            return idx;
        }
        
        public int compareTo(Num another) {
            if (value == another.value) {
                return idx - another.idx;
            } else {
                return value - another.value;
            }
        }
    }
}