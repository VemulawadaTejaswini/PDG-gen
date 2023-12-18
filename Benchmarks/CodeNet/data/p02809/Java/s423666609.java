import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 第6回 ドワンゴからの挑戦状 予選 D - Arrangement

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            list.add(i + 1);
        }

        b[0] = list.get(0);
//        System.out.println(b[0]);
        list.remove(0);
        
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j) != a[b[i - 1] - 1]) {
//                    System.out.println("list.get(j)=" + list.get(j));
//                    System.out.println("a[b[i - 1] - 1]=" + a[b[i - 1] - 1]);
                    b[i] = list.get(j);
//                    System.out.println(b[i]);
                    list.remove(j);
                    break;
                }
                if (j == list.size() - 1) {
                    System.out.println(-1);
                    return;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(b[i]);
        }
        System.out.println();
    }
}