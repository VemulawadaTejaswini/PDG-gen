import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    public void run() {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();

        int i = 1;
        Set<Long> set = new HashSet<>();
        long val = A % B;
        boolean found = false;
        while (!set.contains(val)) {
            if (val == C) {
                found = true;
                break;
            }
            set.add(val);
            i++;
            val = (A * i) % B;
        }

        System.out.println(found ? "YES" : "NO");
        return;
    }

}