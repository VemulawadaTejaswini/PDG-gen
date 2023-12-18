import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer> d = new HashSet<>();
        for (int i=0; i<n; i++) {
            int di = sc.nextInt();
            d.add(di);
        }
        System.out.println(d.size());
        sc.close();
    }
}