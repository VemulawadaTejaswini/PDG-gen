import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        List<Integer> alist = new ArrayList<>();
        int max = 0;
        int secondMax = 0;
        for (int x=1; x<=n;x++) {
            int tmp = Integer.parseInt(sc.next());
            alist.add(tmp);
            if (max<=tmp) {
                secondMax = max;
                max=tmp;
                continue;
            }
            if (secondMax<tmp) {
                secondMax=tmp;
            }
            
        }
        for (int x=1; x<=n;x++) {
            int tmp = alist.get(x-1);
            System.out.println(tmp!=max?max:secondMax);
        }
    }
}
