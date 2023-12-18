import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int n = in.nextInt(), m = in.nextInt();
        Pair[] pairs = new Pair[m];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < m; i++) {
            pairs[i] =new Pair();
            pairs[i].a = in.nextInt();
            pairs[i].b = in.nextInt();
            if(pairs[i].a == 1) {
                list.add(pairs[i].b);
            }
        }
        
        Arrays.sort(pairs, new Comparator<Pair>() {
            public int compare(Pair p1, Pair p2) {
                return p1.a > p2.a ? 1 : -1;
            }
        });
        for(int i : list) {
            for(int j = 0; j < m; j++) {
                if(pairs[j].a > i) continue;
                if(pairs[j].a == i && pairs[j].b == n) {
                    System.out.println("POSSIBLE");
                    return;
                }
            }
        }
        System.out.println("IMPOSSIBLE");
    }
}

class Pair{
    int a, b;
}