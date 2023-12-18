import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        Long K = in.nextLong();
        String ln = in.nextLine();
        List<Integer> vals = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            vals.add(in.nextInt());
        }
        List<Integer> s = new ArrayList<>();
        List<String> pattern = new ArrayList<>();
        List<List<Integer>> patts = new ArrayList<>();
        boolean end = true;
        pattern.add("[]");
        for (int i = 0; i < K; i++) {
            for (int j = 0; j < N; j++) {
                if (s.contains(vals.get(j))) {
                    for (int k = s.size() - 1; k > s.lastIndexOf(vals.get(j)); k--) {
                        s.remove(k);
                    }
                    s.remove(s.size() - 1);
                } else {
                    s.add(vals.get(j));
                }
            }
            if (pattern.contains(s.toString())) {
                end = false;
                break;
            } else {
                pattern.add(s.toString());
            }
        }

        int ansindex = Integer.parseInt(String.valueOf(K % pattern.size()));
        if (end) {
            ansindex = pattern.size() - 1;
        }
        String asd = pattern.get(ansindex).replaceAll(", ", " ");
        String ans = asd.substring(1, asd.length() - 1);
        System.out.println(ans);


    }
}
