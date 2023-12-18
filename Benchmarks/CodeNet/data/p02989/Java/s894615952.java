import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        list.sort(Comparator.naturalOrder());
        int half = n/2-1;
        int result = 0;
        if (list.get(half).equals(list.get(half+1))) {
            System.out.println(result);
            return;
        }
        result = list.get(half+1) - list.get(half);
        System.out.println(result);
    }
}