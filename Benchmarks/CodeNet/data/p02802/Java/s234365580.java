import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s1 = scanner.nextLine().split(" ");
        int M = Integer.parseInt(s1[1]);
        HashMap<String, Integer> problems = new HashMap<>();
        int ac = 0;
        for (int i = 0; i < M; i++) {
            String[] s2 = scanner.nextLine().split(" ");
            String pi = s2[0];
            String st = s2[1];
            if (problems.containsKey(pi)) {
                if (problems.get(pi) > 0) {
                    if (st.equalsIgnoreCase("AC")) {
                        ac ++;
                        problems.replace(pi, -(problems.get(pi)));
                    } else {
                        problems.replace(pi, problems.get(pi) + 1);
                    }
                }
            } else {
                if (st.equalsIgnoreCase("AC")) {
                    ac ++;
                    problems.put(pi, 0);
                } else {
                    problems.put(pi, 1);
                }
            }
        }
        int wa = 0;
        for (String string : problems.keySet()) {
            int a = problems.get(string);
            if (a > 0) {
                wa += a;
            } else {
                wa += -a;
            }
        }
        System.out.println(ac + " " + wa);
    }
}