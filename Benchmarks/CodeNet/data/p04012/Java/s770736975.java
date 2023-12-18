import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    private Set<Integer> createSet(int M) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 1; i <= M; i++) {
            set.add(i);
        }
        return set;
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        String w = sc.next();

        int[] cnt = new int[26];

        for (char ch : w.toCharArray()) {
            cnt[ch - 'a']++;
        }

        for (int c : cnt) {
            if (c % 2 != 0) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");

        return;
    }

}