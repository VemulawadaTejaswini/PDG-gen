import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        init();
        int n = nextInt();
        long d = nextLong();
        a = nextLong();
        ArrayList<Monster> monsters = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            monsters.add(new Monster(nextLong(), nextLong()));
        }

        monsters.sort(Monster::compareTo);
//        System.out.println(monsters);
        long totalBlasts = 0;
        long blastsAffecting = 0;
        LinkedList<BlastEffect> blastEffects = new LinkedList<>();
        for (Monster monster : monsters) {
//            System.out.println(blastEffects);
            while (!blastEffects.isEmpty() && blastEffects.getFirst().lastRange < monster.x) {
                BlastEffect blastEffect = blastEffects.removeFirst();
                blastsAffecting -= blastEffect.numBlasts;
                if (blastsAffecting < 0) blastsAffecting = 0;
            }
            long blastsNeeded = Math.max(0, monster.blastsNeeded - blastsAffecting);
//            System.out.println(monster.x + " " + blastsNeeded);
            totalBlasts += blastsNeeded;
            blastsAffecting += blastsNeeded;
            if (blastsNeeded > 0) blastEffects.addLast(new BlastEffect(blastsNeeded, monster.x + 2*d));
        }

        System.out.println(totalBlasts);
    }

    private static long a;

    private static class BlastEffect {
        long numBlasts;
        long lastRange;

        BlastEffect(long numBlasts, long lastRange) {
            this.numBlasts = numBlasts;
            this.lastRange = lastRange;
        }

        @Override
        public String toString() {
            return "BlastEffect{" +
                    "numBlasts=" + numBlasts +
                    ", lastRange=" + lastRange +
                    '}';
        }
    }

    private static class Monster implements Comparable<Monster> {
        long x;
        long blastsNeeded;

        Monster(long x, long h) {
            this.x = x;
            this.blastsNeeded = (long) Math.ceil((double) h / a);
        }

        @Override
        public int compareTo(Monster monster) {
            return (int) x - (int) monster.x;
        }

        @Override
        public String toString() {
            return "Monster{" +
                    "x=" + x +
                    ", blastsNeeded=" + blastsNeeded +
                    '}';
        }
    }

    //Input Reader
    private static BufferedReader reader;
    private static StringTokenizer tokenizer;

    private static void init() {
        reader = new BufferedReader(new InputStreamReader(System.in));
        tokenizer = new StringTokenizer("");
    }

    private static String next() throws IOException {
        String read;
        while (!tokenizer.hasMoreTokens()) {
            read = reader.readLine();
            if (read == null || read.equals(""))
                return "-1";
            tokenizer = new StringTokenizer(read);
        }

        return tokenizer.nextToken();
    }

    private static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    private static long nextLong() throws IOException {
        return Long.parseLong(next());
    }
}