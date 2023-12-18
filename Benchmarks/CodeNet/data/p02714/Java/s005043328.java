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
            if (b.type.equals("R")) {
                sum += calc(b.source, b.map.get("G"), b.map.get("B"));
            } else if (b.type.equals("G")) {
                sum += calc(b.source, b.map.get("R"), b.map.get("B"));
            } else if (b.type.equals("B")) {
                sum += calc(b.source, b.map.get("R"), b.map.get("G"));
            }
            sum = sum - b.minus;
        }

        System.out.println(sum);
    }

    static int calc(int source, List<Integer> lista, List<Integer> listb) {
        int sum = 0;

        while (lista.size() > 0 && listb.size() > 0) {
            int a = lista.get(0);
            int b = listb.get(0);

            if (a > b) {
                sum += lista.size();
                listb.remove(0);
            } else if (a < b) {
                sum += listb.size();
                lista.remove(0);
            }
        }

        return sum;
    }

    static class Bucket {
        String type;
        int source;
        Map<String, List<Integer>> map;
        int minus = 0;

        public Bucket(String type, int source) {
            this.type = type;
            this.source = source;
            map = new HashMap<>();
            map.put("R", new ArrayList<>());
            map.put("G", new ArrayList<>());
            map.put("B", new ArrayList<>());
        }

        public void addR(int position) {
            List<Integer> list = choiceList(Arrays.asList(new String[]{type, "R"}));
            if (!enableAdd(source, position, list)) {
                minus++;
            }
            this.map.get("R").add(position);
        }

        public void addG(int position) {
            List<Integer> list = choiceList(Arrays.asList(new String[]{type, "G"}));
            if (!enableAdd(source, position, list)) {
               minus++;
            }
            this.map.get("G").add(position);
        }

        public void addB(int position) {
            List<Integer> list = choiceList(Arrays.asList(new String[]{type, "B"}));
            if (!enableAdd(source, position, list)) {
                minus++;
            }
            this.map.get("B").add(position);
        }

        public String toString() {
            return type + "_" + source + "_" + map.get("R") + ":" + map.get("G") + ":" + map.get("B") + "_" + minus;
        }

        List<Integer> choiceList(List<String> contains) {
            if (!contains.contains("R")) {
                return map.get("R");
            } else if (!contains.contains("G")) {
                return map.get("G");
            } else {
                return map.get("B");
            }
        }

        boolean enableAdd(int source, int aposition, List<Integer> listb) {
            for (int b : listb) {
                if ((b - source) == (aposition - b)) {
                    System.out.println(source + "_" + b + "_" + aposition);
                    return false;
                }
            }
            return true;
        }
    }

}