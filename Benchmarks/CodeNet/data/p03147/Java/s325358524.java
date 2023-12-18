import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        System.out.println(cut(arr));
    }

    private static int cut(List<Integer> list) {
        if (list.size() == 0) return 0;

        int retV = 0;

        int min = list.stream().min(Integer::compareTo).get();

        List<ArrayList<Integer>> lists = new ArrayList<>();
        ArrayList<Integer> pushed = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == min) {
                lists.add(pushed);
                pushed = new ArrayList<>();
            } else {
                pushed.add(list.get(i) - min);
            }
        }
        lists.add(pushed);
        retV += min;
        for (ArrayList<Integer> list2 : lists) {
            retV += cut(list2);
        }
        return retV;
    }
}