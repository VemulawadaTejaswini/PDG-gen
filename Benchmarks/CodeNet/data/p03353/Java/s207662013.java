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
        for (int i = 0; i < s.length(); i++) {
            for (int j = 1; j <= 5; j++) {
                if (i + j > s.length()) break;
                subStringsSet.add(s.substring(i, i + j));
//                System.out.println(s.substring(i, i + j));
            }
        }

        ArrayList<String> subStringsList = new ArrayList<>(subStringsSet);
        Collections.sort(subStringsList);

        System.out.println(subStringsList.get(k - 1));
    }

}
