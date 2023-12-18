import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        List<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            for (int j = 0; j < b; j++) {
                list.add(a);
            }
        }
        Collections.sort(list);
        System.out.println(list.get(K - 1));
    }
}
