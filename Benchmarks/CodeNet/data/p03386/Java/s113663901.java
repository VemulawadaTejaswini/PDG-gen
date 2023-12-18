import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();

        List<Integer> ans = new ArrayList<>();

        for (int i = a; i <= b; i++) {
            if (i < a+k && !ans.contains(i)) ans.add(i);
            if (i > b-k && !ans.contains(i)) ans.add(i);
        }

        Collections.sort(ans);

        for (Integer i: ans) {
            System.out.println(i);
        }
    }
}
