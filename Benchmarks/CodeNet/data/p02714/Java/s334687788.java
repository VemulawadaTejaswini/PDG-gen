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
        for(int i=0; i<s.length; i++) {
            if(s[i].equals("R")) r.add(i+1);
            if(s[i].equals("G")) g.add(i+1);
            if(s[i].equals("B")) b.add(i+1);
        }
        long count = 0;
        for(int R : r) {
            for(int G : g) {
                for(int B : b) {
                    if(R < G && R < B) {
                        if(sa(R,Math.min(G,B))*2 == sa(R,Math.max(G,B))) {
                            continue;
                        }
                    }else if(G < R && G < B) {
                        if(sa(G,Math.min(R,B))*2 == sa(G,Math.max(R,B))) {
                            continue;
                        }
                    }else if(B < R && B < G) {
                        if(sa(B,Math.min(R,G))*2 == sa(B,Math.max(R,G))) {
                            continue;
                        }
                    }
                    count++;
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
