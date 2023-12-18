import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.next();
        int m = sc.nextInt();
        List<Point> list = new ArrayList<>();
        IntStream.range(0, m).forEach(value -> list.add(new Point(sc.nextInt(), sc.nextInt())));
        Collections.sort(list, Comparator.comparingInt(o -> o.y));

        int ans = 0, lastIndex = -1;
        for (int i = 0; i < m; i++) {
            if(list.get(i).x > lastIndex) {
                ans++;
                lastIndex = list.get(i).y-1;
            }
        }
        System.out.println(ans);
    }
}
