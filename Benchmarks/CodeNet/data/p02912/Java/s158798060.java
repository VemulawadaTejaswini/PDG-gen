import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        TreeSet<Element> a = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            a.add(new Element(i, sc.nextInt()));
        }
        for (int i = 0; i < m; i++) {
            Element max = a.last();
            a.remove(max);
            Element newE = new Element(max.seq, max.num / 2);
            a.add(newE);
        }
        long sum = a.stream().mapToLong(x -> x.num).sum();
        System.out.println(sum);

        sc.close();
    }

    static class Element implements Comparable<Element> {
        int seq;
        int num;

        public Element(int seq, int num) {
            this.seq = seq;
            this.num = num;
        }

        @Override
        public int compareTo(Element o) {
            if (num != o.num) {
                return num - o.num;
            } else {
                return seq - o.seq;
            }
        }
    }

}
