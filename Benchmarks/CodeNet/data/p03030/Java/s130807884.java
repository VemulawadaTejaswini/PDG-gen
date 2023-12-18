import java.util.Arrays;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Obj[] objs = new Obj[N];
        for (int i = 0; i < N; i++) {
            objs[i] = new Obj(scanner.next(), scanner.nextInt(), i);
        }
        Arrays.sort(objs);
        for (Obj obj : objs) {
            System.out.println(obj.num + 1);
        }
    }

    public static class Obj implements Comparable<Obj> {
        String name;
        int p;
        int num;

        public Obj(String name, int p, int num) {
            this.name = name;
            this.p = p;
            this.num = num;
        }

        @Override
        public int compareTo(Obj o) {
            if (this.name.compareTo(o.name) == 0) {
                return -Integer.compare(this.p, o.p);
            } else {
                return this.name.compareTo(o.name);
            }
        }

    }
}
