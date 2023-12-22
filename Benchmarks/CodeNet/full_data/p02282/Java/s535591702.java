import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    static void reconstruction(
            Iterator<Integer> preItr, List<Integer> inWalked, List<Integer> postWalked, int l, int r) {
        if (l >= r) return;

        int curr = preItr.next();
        int m = inWalked.indexOf(curr);

        reconstruction(preItr, inWalked, postWalked, l, m);
        reconstruction(preItr, inWalked, postWalked, m + 1, r);

        postWalked.add(curr);
    }

    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            final int n = Integer.parseInt(in.readLine());
            List<Integer> preWalked = Stream.of(in.readLine().split(" "))
                    .map(Integer::valueOf)
                    .collect(Collectors.toList());
            List<Integer> inWalked = Stream.of(in.readLine().split(" "))
                    .map(Integer::valueOf)
                    .collect(Collectors.toList());

            List<Integer> postWalked = new ArrayList<>(n);

            reconstruction(preWalked.iterator(), inWalked, postWalked, 0, n);

            System.out.println(postWalked.stream().map(String::valueOf).collect(Collectors.joining(" ")));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

