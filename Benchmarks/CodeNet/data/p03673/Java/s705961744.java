import java.util.*;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int len = Integer.parseInt(sc.nextLine());
        List<Integer> b = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            b.add(sc.nextInt());
            Collections.reverse(b);
        }

        StringJoiner sj = new StringJoiner(" ");
        for (Integer i : b) {
            sj.add(i.toString());
        }
        System.out.print(sj.toString());
    }
}
