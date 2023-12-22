
import java.util.*;

import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {
    int INF = 1 << 28;
    void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<T> tt = new HashSet<T>();
        for (int i = 0; i < n; i++) tt.add(new T(sc.nextInt(), sc.nextInt()));
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) tt.add(new T(sc.nextInt(), sc.nextInt()));
        
        ArrayList<T> ts = new ArrayList<T>(tt);
        sort(ts);
        
        for (int i = 0; i < ts.size(); i++) {
            System.out.print(ts.get(i) + (i == ts.size() - 1 ? "\n" : " "));
        }
    }
    
    class T implements Comparable<T>{
        int h, m;
        T(int h, int m) {
            this.h = h;
            this.m = m;
        }
        @Override
        public int compareTo(T o) {
            // TODO ティツ?ェテ・ツ仰陛ァツ板淌ヲツ按静」ツ?陛」ツつ古」ツ?淌」ツδ。テ」ツつステ」ツδε」ツδ嘉」ツδサテ」ツつケテ」ツつソテ」ツδ?
            if (h != o.h)
                return h - o.h;
            return m - o.m;
        }
        
        @Override
        public String toString() {
            return h + ":" + (m/10 == 0 ? "0" : "") + m;
        }
        
        public int hashCode() {
            return h * 100 + m;
        }
        
        public boolean equals(Object o) {
            if (o instanceof T) {
                T t = (T)o;
                return h == t.h && m == t.m;
            }
            return false;
        }
    }
    
    void debug(Object...os) {
        System.out.println(deepToString(os));
    }
    
    public static void main(String[] args) {
        new Main().run();
    }
}