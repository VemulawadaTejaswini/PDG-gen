import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();

        List<NavigableSet<Integer>> positionSets = new ArrayList<>();
        for (int i = 0; i < 26; i++) positionSets.add(new TreeSet<>());

        for (int i = 0; i < s.length(); i++) {
            positionSets.get(s.charAt(i) - 'a').add(i);
        }

        long loops = 0;
        int position = -1;

        for (int i = 0; i < t.length(); i++) {
            NavigableSet<Integer> positions = positionSets.get(t.charAt(i) - 'a');
            if (positions.isEmpty()) {
                System.out.println(-1);
                return;
            }
            Integer next = positions.higher(position);
            if (next == null) {
                loops++;
                position = positions.first();
            } else {
                position = next;
            }
        }

        System.out.println(loops * s.length() + position + 1);
    }

}
