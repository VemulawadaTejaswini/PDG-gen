import java.util.*;
public class Main{
public static void main(String gg[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int correctAns = 0;
        int penalty = 0;
        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 0; i < m; i++) {
            int problem = sc.nextInt();
            String status = sc.next();
            if (!map.containsKey(problem)) {
                map.put(problem, " ");
            }

            if (map.get(problem).equals("AC")) {
                continue;
            }

            if (map.containsKey(problem) && !status.equals("AC")) {
                map.put(problem, status);
                penalty++;
            } else {
                map.put(problem, status);
                correctAns++;
            }
        }

            System.out.println(correctAns + " " + penalty);
        }
}