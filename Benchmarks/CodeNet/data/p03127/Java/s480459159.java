import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i=0; i<n; i++) list.add(sc.nextInt());
        Collections.sort(list);

        while (1 < list.size()) {
            for (int i=1; i<list.size(); i++) {
                int tmp = list.get(i);
                tmp %= list.get(0);
                if (tmp == 0) {
                    list.remove(i);
                    i--;
                } else {
                    list.set(i, tmp);
                }
            }
            Collections.sort(list);
//            System.out.println(list);
        }

        System.out.println(list.get(0));

    }

}

