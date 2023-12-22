import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> heights = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            heights.add(Integer.parseInt(sc.next()));
        }

        Collections.sort(heights, (o1, o2) -> {
            if (o1 > o2) {
                return -1;
            }
            if (o1 < o2) {
                return 1;
            }
            return 0;
        });

        for (int i = 0; i < 3; i++) {
            System.out.println(heights.get(i));
        }
    }
}