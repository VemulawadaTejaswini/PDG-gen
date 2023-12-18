import java.util.*;

public class Main {
    //Guidebook
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Pair> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String name = sc.next();
            int score = sc.nextInt();
            Pair p = new Pair(name, score, i);
            list.add(p);
        }
        Collections.sort(list, new Comparator<Pair>() {
            @Override
            public int compare(Pair a, Pair b) {
                if (a.name.equals(b.name)) return b.score - a.score;
                else return a.name.compareTo(b.name);
            }
        });
        for (Pair p : list) System.out.println(p.index);
        sc.close();
    }

    static class Pair {
        String name;
        int score;
        int index;

        public Pair(String name, int score, int index) {
            this.name = name;
            this.score = score;
            this.index = index;
        }
    }
}
