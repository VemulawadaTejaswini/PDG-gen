import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        List<Integer> intList = new ArrayList<>();
        for (int i=0;i<n;i++) {
            intList.add(sc.nextInt());
        }
        for (int i=0;i<q;i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            List<Integer> subList1 = intList.subList(l-1,r);
            Set h = new HashSet(subList1);
            System.out.println(h.size());
        }
    }
}
