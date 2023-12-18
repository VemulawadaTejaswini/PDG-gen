import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x[] = new int[n];
        int l[] = new int[n];
        int left[] = new int[n];
        int right[] = new int[n];
        Pair[] pairs = new Pair[n];
        for (int i = 0 ; i < n ; i++) {
            x[i] = sc.nextInt();
            l[i] = sc.nextInt();
            Pair pair = new Pair();
            pair.from = x[i] - l[i];
            pair.end = x[i] + l[i];
            pairs[i] = pair;
        }

        Arrays.sort(pairs);
        int index = pairs[0].end;
        int count = 1;
        for (int i = 1 ; i < n ; i++) {
            if (index <= pairs[i].from) {
                count++;
                index = pairs[i].end;
            }
        }
        System.out.println(count);


    }

}

class Pair implements Comparable {
    int from;
    int end;
    @Override
    public int compareTo(Object other) {
        Pair otherpair = (Pair) other;
        return end - otherpair.end;
    }
}
