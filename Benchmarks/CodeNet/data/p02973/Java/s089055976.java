import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> maxs = new ArrayList<>();
        int num = Integer.parseInt(in.nextLine());
        maxs.add(Integer.parseInt(in.nextLine()));
        hoge: for (int i = 0; i < num - 1; i++) {
            int a = Integer.parseInt(in.nextLine());
            for (int j = 0; j < maxs.size(); j++) {
                if (maxs.get(j) < a) {
                    maxs.set(j, a);
                    continue hoge;
                }
            }
            maxs.add(a);
        }
        System.out.println(maxs.size());
    }
}
