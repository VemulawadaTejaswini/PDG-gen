import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<R> list = new ArrayList<>();

        for(int i=0; i<n; i++) {
            list.add(new R(i+1, sc.next(), sc.nextInt()));
        }
        Collections.sort(list);
        for(R r : list) {
            System.out.println(r.num);
        }
    }

    static class R implements Comparable<R>{
        int num;
        String s;
        int p;
        public R(int num, String s, int p) {
            this.num = num;
            this.s = s;
            this.p = p;
        }
        public int compareTo(R o) {
            int a = s.compareTo(o.s);
            if(a != 0) return a;
            return o.p - p;
        }

    }

}
