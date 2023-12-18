import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s1 = scanner.nextLine().split(" ");
        int M = Integer.parseInt(s1[1]);
        HashMap<Integer, Integer> problems = new HashMap<>();
        for (int i = 0; i < M; i++) {
            String[] s2 = scanner.nextLine().split(" ");
            int pi = Integer.parseInt(s2[0]);
            String st = s2[1];
            if (problems.containsKey(pi)) {
                if (problems.get(pi) > 0) {
                    if (st.equalsIgnoreCase("AC")) {
                        problems.replace(pi, -(problems.get(pi)));
                    } else {
                        problems.replace(pi, problems.get(pi) + 1);
                    }
                }
            } else {
                if (st.equalsIgnoreCase("AC")) {
                    problems.put(pi, 0);
                } else {
                    problems.put(pi, 1);
                }
            }
        }
        int ac = 0;
        int wa = 0;
        for (Integer integer : problems.keySet()) {
            int a = problems.get(integer);
            if (a > 0) {
                wa += a;
            } else {
                wa += -a;
                ac++;
            }
        }
        System.out.println(ac + " " + wa);
    }
}