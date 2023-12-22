import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        for (int i = 3; i <= n; i++) {
            boolean judge = false;

            if (i % 3 == 0) {
                judge = true;
            } else if ((String.valueOf(i)).indexOf("3") != -1) {
                judge = true;
            }

            if (judge == true) {
                list.add(i);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print(" " + list.get(i));
        }

        System.out.print("\n");

        sc.close();
    }
}
