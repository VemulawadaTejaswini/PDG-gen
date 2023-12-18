import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long k = sc.nextInt();
        List<Integer> ll = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ll.add(sc.nextInt());
        }
        Collections.sort(ll);
        Collections.reverse(ll);
        long ans1 = 0;
        for (int i = 0; i < Math.min(k, n); i++) {
            ans1 += ll.get(i);
        }
        long ans2 = 0;
        for (int i = 0; i < n; i++) {
            ans2 += ll.get(i);
        }
        System.out.println(ans2 - ans1);
    }


    public static int log2(long x) {
        return (int) (Math.log(x) / Math.log(2));
    }
}
