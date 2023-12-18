import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        char[] a = sc.next().toCharArray();
        char[] b = sc.next().toCharArray();
        char[] c = sc.next().toCharArray();

        int al = a.length;
        int bl = b.length;
        int cl = c.length;

        Set<Integer> ab = new HashSet<>();
        Set<Integer> bc = new HashSet<>();
        Set<Integer> ac = new HashSet<>();

        OUTER: for(int os = -bl-cl; os <= al+cl; os++) {
            if(os <= -bl || os >= al ) {
                ab.add(os);
                continue;
            }
            for(int i=0; i<bl; i++) {
                int ai = os + i;
                if(0<=ai && ai<al && b[i] != '?' && a[ai] != '?' && b[i] != a[ai]) continue OUTER;
            }
            ab.add(os);
        }
        OUTER: for(int os = -bl-cl; os <= al+bl; os++) {
            if(os <= -cl || os >= al ) {
                ac.add(os);
                continue;
            }
            for(int i=0; i<cl; i++) {
                int ai = os + i;
                if(0<=ai && ai<al && c[i] != '?' && a[ai] != '?' && c[i] != a[ai]) continue OUTER;
            }
            ac.add(os);
        }
        OUTER: for(int os = -al-cl; os <= bl+cl; os++) {
            if(os <= -cl || os >= bl ) {
                bc.add(os);
                continue;
            }
            for(int i=0; i<cl; i++) {
                int bi = os + i;
                if(0<=bi && bi<bl && c[i] != '?' && b[bi] != '?' && c[i] != b[bi]) continue OUTER;
            }
            bc.add(os);
        }

        int min = 10000;
        for(Integer abo : ab) {
            for(Integer bco : bc) {
                int aco = abo + bco;
                if(ac.contains(aco)) {
                    int left = Math.min(0, Math.min(abo, aco));
                    int right = Math.max(al, Math.max(abo + bl, aco + cl));
                    min = Math.min(min, right - left);
                }
            }
        }
        System.out.println(min);
    }
}