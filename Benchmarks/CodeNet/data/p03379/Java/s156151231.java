
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static class Pair {
        int num;
        int pos;
        int sortedPos;

        Pair(int num, int pos) {
            this.num = num;
            this.pos = pos;
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Pair> numbers = new ArrayList<>();
        for (int i= 0; i < n; ++i) {
            numbers.add(new Pair(sc.nextInt(), i));
        }
        List<Pair> sortedCopy = new ArrayList(numbers);

        sortedCopy.sort((o1, o2) -> { return o2.num - o1.num; });
        for (int i = 0; i < n; ++i) {
            sortedCopy.get(i).sortedPos = i;
        }

        int media = sortedCopy.get(((n - 1) / 2)).num;
        int mediaNext = sortedCopy.get(((n - 1) / 2) + 1).num;
        for (int i = 0; i < n; ++i) {
            Pair p = numbers.get(i);
            if (p.sortedPos <= (n - 1)/ 2) {
                System.out.println(mediaNext);
            } else {
                System.out.println(media);
            }
        }
    }

}
