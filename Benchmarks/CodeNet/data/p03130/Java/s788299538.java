import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            a.add(sc.nextInt());
            b.add(sc.nextInt());
        }
        int[] count = new int[4];
        for (int i = 0; i < 3; i++) {
            count[a.get(i) - 1]++;
            count[b.get(i) - 1]++;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] >= 3) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }

}
