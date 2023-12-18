import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// 1 2 3 4
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();

        ArrayList<String> si = new ArrayList<>();
        for (int i = 0; i < H; i++) {
            si.add(sc.next());
        }
        ArrayList<String> ai = new ArrayList<>();
        for (String s : si) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            ai.add(new String(chars));
        }
        ai.sort(Comparator.naturalOrder());
        for (int i = 0; i < H; i++) {
            if (ai.get(i).equals(ai.get(i + 1))) {
                i++;
                continue;
            }
            if (i % 2 != 0) {
                System.out.println("NO");
                return;
            }
        }
        ai.clear();
        for (int i = 0; i < W; i++) {
            char[] chars = new char[H];
            for (int j = 0; j < H; j++) {
                chars[j] = si.get(j).toCharArray()[i];
            }
            Arrays.sort(chars);
            ai.add(new String(chars));
        }
        ai.sort(Comparator.naturalOrder());
        for (int i = 0; i < H; i++) {
            if (ai.get(i).equals(ai.get(i + 1))) {
                i++;
                continue;
            }
            if (i % 2 != 0) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
