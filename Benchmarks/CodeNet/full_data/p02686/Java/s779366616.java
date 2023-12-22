import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();

        List<P> pos = new ArrayList<>();
        List<P> neg = new ArrayList<>();

        for(int i=0; i<n; i++) {
            P p = new P(sc.next());
            if(p.last >= 0) {
                pos.add(p);
            } else {
                neg.add(p);
            }
        }
        Collections.sort(pos, new Comparator<P>() {
            @Override public int compare(P o1, P o2) {
                return o2.low - o1.low;
            }
        });
        Collections.sort(neg, new Comparator<P>() {
            @Override public int compare(P o1, P o2) {
                return o1.low - o2.low;
            }
        });

        int l = 0;
        for(P p : pos) {
            if(l + p.low < 0) {
                System.out.println("No");
                return;
            }
            l += p.last;
        }
        for(P p : neg) {
            if(l + p.low < 0) {
                System.out.println("No");
                return;
            }
            l += p.last;
        }
        if(l == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    static class P {
        int low;
        int last;
        P(String s) {
            int pos = 0;
            for(char c : s.toCharArray()) {
                if(c == '(') {
                    pos++;
                } else {
                    pos--;
                    low = Math.min(low, pos);
                }
            }
            last = pos;
        }
    }


}