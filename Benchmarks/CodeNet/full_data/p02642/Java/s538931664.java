import java.util.*;
import java.text.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();
        int[] arr = new int[n];
//        for (int i=0; i<n; i++) arr[i] = sc.nextInt();
//        Arrays.sort(arr);

        List<Integer> list = new ArrayList<>();
        for (int i=0; i<n; i++) list.add(sc.nextInt());
        Collections.sort(list);

        int cnt = 0;

        while (0 < list.size()) {
//            System.out.println(list);
            int tmp = list.get(0);
            int v = 10000000;
            if (1<list.size()) v = list.get(1);
            if (tmp!=v) cnt++;
            for (int i=1; i<list.size(); i++) {
                if (list.get(i)%tmp==0) {
                    list.remove((Integer)list.get(i));
                    i--;
                }
            }
            list.remove(0);
        }

        System.out.println(cnt);
    }


}
