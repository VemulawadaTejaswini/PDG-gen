import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    public void run() {
        Scanner sc = new Scanner(System.in);
        char[] S = sc.next().toCharArray();

        Set<Character> set = new HashSet<Character>();

        for (char ch: S) {
            if (set.contains(ch)) {
                System.out.println("no");
                System.exit(0);
            }
            set.add(ch);
        }
        System.out.println("yes");

        return;
    }

}