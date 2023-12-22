import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(sc.next()));
        }
        ArrayList<Integer> list2 = new ArrayList<>(list);

        for (int i = 0; i < m; i++) {
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            int x = 0;
            int y = 0;
            if (list.get(a-1) > list.get(b-1)) {
                x = list.get(b-1);
                if (list2.contains(x)){
                    list2.remove(list2.indexOf(x));
                }
            } else if (list.get(a-1) == list.get(b-1)) {
                x = list.get(a -1);
                y = list.indexOf(x);
                if (list2.contains(x)){
                    list2.remove(list2.indexOf(x));
                }
                x = list.get(a -1);
                y = list.indexOf(x);
                if (list2.contains(x)){
                    list2.remove(list2.indexOf(x));
                }
            }
            else {
                x = list.get(a-1);
                y = list.indexOf(x);
                if (list2.contains(x)){
                    list2.remove(list2.indexOf(x));
                }
            }


        }
        System.out.println(list2.size());

    }
}