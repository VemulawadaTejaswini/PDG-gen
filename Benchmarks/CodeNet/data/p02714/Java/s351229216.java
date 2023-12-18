import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();

        List<Bucket> buckets = new ArrayList<>();

        int i = 0;
        for (char c : s.toCharArray()) {
            String type = String.valueOf(c);
            for (Bucket b : buckets) {
                if (!b.type.equals(type)) {
                    if (type.equals("R")) {
                        b.addR(i);
                    } else if (type.equals("G")) {
                        b.addG(i);
                    } else if (type.equals("B")) {
                        b.addB(i);
                    }
                }
            }

            Bucket bucket = new Bucket(type, i);
            buckets.add(bucket);
            i++;
        }

        long sum = 0;
        for (Bucket b : buckets) {
            int source = b.source;
            if (b.type.equals("R")) {
                sum += calc(source, b.g, b.b);
            } else if (b.type.equals("G")) {
                sum += calc(source, b.r, b.b);
            } else if (b.type.equals("B")) {
                sum += calc(source, b.r, b.g);
            }
        }

        System.out.println(sum);
    }

    static int calc(int source, List<Integer> lista, List<Integer> listb) {
        int sum = 0;

        while (lista.size() > 0 && listb.size() > 0) {
            int a = lista.get(0);
            int b = listb.get(0);

            if (a > b) {
                for (int target : lista) {
                    if ((b - source) == (target - b)) {

                    } else {
                        sum++;
                    }
                }
                listb.remove(0);
            } else if (a < b) {
                for (int target : listb) {
                    if ((a - source) == (target - a)) {

                    } else {
                        sum++;
                    }
                }
                lista.remove(0);
            }
        }

        return sum;
    }

    static class Bucket {
        String type;
        int source;
        List<Integer> r;
        List<Integer> g;
        List<Integer> b;

        public Bucket(String type, int source) {
            this.type = type;
            this.source = source;
            this.r = new ArrayList<>();
            this.g = new ArrayList<>();
            this.b = new ArrayList<>();
        }

        public void addR(int position) {
            this.r.add(position);
        }

        public void addG(int position) {
            this.g.add(position);
        }

        public void addB(int position) {
            this.b.add(position);
        }

        public String toString() {
            return type + "_" + source + "_" + r + ":" + g + ":" + b;
        }
    }

}