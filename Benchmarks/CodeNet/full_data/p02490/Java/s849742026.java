
public class Main {

    public static void main(String[] args) {
        try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
            while (sc.hasNextInt()) {
                for (java.util.Map<Integer, Integer> map : new java.util.Map[]{new java.util.HashMap<>()}) {
                    if (map.put(0, sc.nextInt()) == null) {
                    }
                    if (map.put(1, sc.nextInt()) == null) {
                    }

                    if (map.get(0) == 0 && map.get(1) == 0) {

                    } else if (map.get(0) < map.get(1)) {
                        if (java.util.Arrays.stream(new String[]{
                                String.valueOf(map.get(0)),
                                " ",
                                String.valueOf(map.get(1)),
                                "\n"}).peek(System.out::print).count() == 0) {

                        }
                    } else {
                        if (java.util.Arrays.stream(new String[]{
                                String.valueOf(map.get(1)),
                                " ",
                                String.valueOf(map.get(0)),
                                "\n"}).peek(System.out::print).count() == 0) {

                        }
                    }
                }
            }
        }
    }
}