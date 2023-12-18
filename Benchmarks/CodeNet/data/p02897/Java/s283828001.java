import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // key  :i君が教室に入ったときに何人いたか
        // value:i
        TreeMap<Integer, Integer> map = new TreeMap<>();

        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            map.put(sc.nextInt(), i);
        }

        System.out.print(map.get(1));
        for (int i = 2; i <= N; i++) {
            System.out.print(" ");
            System.out.print(map.get(i));
        }
    }
}
