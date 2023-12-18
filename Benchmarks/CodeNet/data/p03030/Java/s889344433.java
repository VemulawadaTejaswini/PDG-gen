import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());

        List<Res> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int point = Integer.parseInt(sc.next());
            list.add(new Res(i, name, point));
        }

        Collections.sort(list, (r1, r2) -> {
            if (!r1.name.equals(r2.name)) {
                return r1.name.compareTo(r2.name);
            }
            else {
                return r1.point < r2.point ? 1 : -1;
            }
        });

        for (Res res : list) {
            System.out.println(res.i + 1);
        }
    }

}

class Res {
    int i;
    String name;
    int point;
    Res (int i, String name, int point) {
        this.i = i;
        this.name = name;
        this.point = point;
    }
}