import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<P> l = new ArrayList<>();
        for(int i=0; i<n; i++) {
            int a = sc.nextInt();
            l.add(new P(i + 1, a));
        }
        Collections.sort(l);
        for(int i=0; i<n; i++) {
            if(i > 0) System.out.print(" ");
            System.out.print(l.get(i).a);
        }
        System.out.println();
    }

    static class P implements Comparable<P>{
        int a;
        int b;
        public P(int a, int b) {
            this.a = a;
            this.b = b;
        }

        @Override public int compareTo(P o) {
            return b - o.b;
        }
    }
}
