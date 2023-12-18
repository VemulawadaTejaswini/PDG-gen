import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        list.add(sc.nextInt());
        list.add(sc.nextInt());
        list.add(sc.nextInt());

        Optional<Integer> s = list.stream().max(Comparator.naturalOrder());
        int r = list.stream().mapToInt(x -> x).sum();
        System.out.println(r - s.get());
    }
}
