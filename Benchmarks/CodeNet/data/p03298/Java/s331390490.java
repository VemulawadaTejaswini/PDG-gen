import java.util.*;
import java.io.*;

class Main {
    static class Node {
        String a;
        String b;
        Node(String a, String b) {
            this.a = a;
            this.b = b;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        ArrayList<Node> l = new ArrayList<>();
        HashMap<String,HashMap<String,Long>> m = new HashMap<>();
        for(int i = 0; i < (1 << N); i++) {
            String s1 = "";
            String s2 = "";
            for(int j = 0; j < N; j++) {
                if((i & (1 << j)) > 0) {
                    s1 += S.substring(j,j+1);
                } else {
                    s2 = S.substring(j,j+1) + s2;
                }
            }
            l.add(new Node(s1,s2));
        }
        for(int i = 0; i < (1 << N); i++) {
            String s1 = "";
            String s2 = "";
            for(int j = 0; j < N; j++) {
                if((i & (1 << j)) > 0) {
                    s1 += S.substring(j + N,j+1 + N);
                } else {
                    s2 = S.substring(j + N,j+1 + N) + s2;
                }
            }
            if(m.containsKey(s1)) {
                HashMap<String,Long> mm = m.get(s1);
                if(mm.containsKey(s2)) {
                    mm.put(s2, mm.get(s2) + 1L);
                } else {
                    mm.put(s2, 1L);
                }
            } else {
                HashMap<String,Long> mm = new HashMap<>();
                mm.put(s2,1L);
                m.put(s1, mm);
            }
        }

        long ans = 0;

        for(int i = 0; i < l.size(); i++) {
            String s1l = l.get(i).a;
            String s2l = l.get(i).b;
            if(m.containsKey(s2l)) {
                HashMap<String,Long> mm = m.get(s2l);
                if(mm.containsKey(s1l)) {
                    ans += mm.get(s1l);
                }
            }

        }

        System.out.println(ans);
        
    }
}