import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        for (int i=0; i<n; i++) {
            a.add(sc.nextInt());
        }

        List<Integer> m = new ArrayList<>();
        for (int count=1; count<=n; count++) {
            for (int start=0; start<=n-count; start++) {
                m.add(median(a.subList(start, start+count)));
            }
        }

        System.out.println(median(m));
    }

    private static int median(List<Integer> list) {
        Collections.sort(list);
        int medIndex = list.size()/2;
        return list.get(medIndex);
    }
}
