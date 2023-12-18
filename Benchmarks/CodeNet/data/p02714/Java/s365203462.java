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
        long count = (long)(r.size()*g.size()*b.size());

        for(int i=0; i<N; i++) {
            for(int j=i+1; j<N; j++) {
                if(j+j-i >= N) break;
                if(s[i].equals(s[j])) continue;
                else if(s[i].equals(s[j+j-i]) || s[j].equals(s[j+j-i])) {
                    continue;
                }else count--;
            }
        }
        System.out.println(count);
    }
    static int sa(int a, int c) {
        if(a <= c) return c-a;
        else return a-c;
    }
}
