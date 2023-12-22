
//semicolonless java
public class Main {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
            while (sc.hasNextInt()) {
                for (java.util.Map<Integer, Integer> map : new java.util.Map[]{new java.util.HashMap<>()}) {
                    if (map.put(0, sc.nextInt()) == null) {
                    }
                    if (map.put(1, sc.nextInt()) == null) {
                    }

                    if (map.get(0) == 0 && map.get(1) == 0) {

                    } else {
                        if (java.util.Arrays.stream(new String[]{
                                String.valueOf(Math.min(map.get(0), map.get(1))),
                                " ",
                                String.valueOf(Math.max(map.get(0), map.get(1))),
                                "\n"}).peek(System.out::print).count() == 0) {

                        }
                    }
                }
            }
        }
    }
}