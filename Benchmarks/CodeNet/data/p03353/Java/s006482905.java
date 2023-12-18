import java.util.*;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    public void solve() {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int k = sc.nextInt();

        Set<String> subStringsSet = new HashSet<>();
        for (int i = 0; i < s.length() - k + 1; i++) {
            for (int j = i; j < i + k + 1; j++) {
                subStringsSet.add(s.substring(i, j));
//                System.out.println(s.substring(i, j));
            }
        }

        ArrayList<String> subStringsList = new ArrayList<>(subStringsSet);
        Collections.sort(subStringsList);

        System.out.println(subStringsList.get(k));
    }

}
