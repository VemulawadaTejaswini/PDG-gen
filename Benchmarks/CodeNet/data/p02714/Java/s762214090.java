import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        String S = sc.next();
        String[] s = S.split("");
        List<Integer> r = new ArrayList<>();
        List<Integer> g = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        for(int i=0; i<N; i++) {
            if(s[i].equals("R")) r.add(i+1);
            if(s[i].equals("G")) g.add(i+1);
            if(s[i].equals("B")) b.add(i+1);
        }
        long count = r.size()*g.size()*b.size();
        
        if(b.size() == Math.max(r.size(), Math.max(g.size(), b.size()))) {
            for(int R : r) {
                for(int G : g) {
                    if(b.contains(sa(R,G)+Math.max(R,G))) count--;
                    if(b.contains(sa(R,G)-Math.min(R,G))) count--;
                    if(sa(R,G) % 2 == 0) {
                        if(b.contains(Math.min(R,G)+sa(R,G)/2)) count--;
                    }
                }
            }
        }else if(g.size() == Math.max(r.size(), Math.max(g.size(), b.size()))) {
            for(int R : r) {
                for(int B : b) {
                    if(g.contains(sa(R,B)+Math.max(R,B))) count--;
                    if(g.contains(sa(R,B)-Math.min(R,B))) count--;
                    if(sa(R,B) % 2 == 0) {
                        if(g.contains(Math.min(R,B)+sa(R,B)/2)) count--;
                    }
                }
            }
        }else if(r.size() == Math.max(r.size(), Math.max(g.size(), b.size()))) {
            for(int G : g) {
                for(int B : b) {
                    if(r.contains(sa(G,B)+Math.max(G,B))) count--;
                    if(r.contains(sa(G,B)-Math.min(G,B))) count--;
                    if(sa(G,B) % 2 == 0) {
                        if(r.contains(Math.min(G,B)+sa(G,B)/2)) count--;
                    }
                }
            }
        }
        System.out.println(count);
    }
    static int sa(int a, int c) {
        if(a <= c) return c-a;
        else return a-c;
    }
}
